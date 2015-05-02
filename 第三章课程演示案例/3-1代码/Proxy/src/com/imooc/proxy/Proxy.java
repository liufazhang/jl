package com.imooc.proxy;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import javax.tools.JavaCompiler.CompilationTask;

import org.apache.commons.io.FileUtils;

public class Proxy {
	
	public static Object newProxyInstance(Class infce) throws Exception{
		String rt = "\r\n";
		String methodStr = "";
		for(Method m : infce.getMethods()){
			methodStr += "	@Override" + rt +
			"	public void " + m.getName() + "() {" + rt +
			"		long starttime = System.currentTimeMillis();" + rt +
			"		System.out.println(\"������ʼ��ʻ....\");" + rt +
			"		m." + m.getName() + "();" + rt +
			"		long endtime = System.currentTimeMillis();" + rt +
			"		System.out.println(\"����������ʻ....  ������ʻʱ�䣺\" " + rt +
			"				+ (endtime - starttime) + \"���룡\");" + rt +
			"	}" ;
		}
		
		String str =
		"package com.imooc.proxy;" + rt +
		"public class $Proxy0 implements " + infce.getName() + " {" + rt +
		"	public $Proxy0(" + infce.getName() + " m) {" + rt +
		"		super();" + rt +
		"		this.m = m;" + rt +
		"	}" + rt +
		"	private " + infce.getName() + " m;" + rt +
		methodStr + rt +
		"}" ;
		//�����������java�ļ�
		String filename = System.getProperty("user.dir") +"/bin/com/imooc/proxy/$Proxy0.java";
		File file = new File(filename);
		FileUtils.writeStringToFile(file, str);
		
		//����
		//�õ�������
		JavaCompiler complier = ToolProvider.getSystemJavaCompiler();
		//�ļ�������
		StandardJavaFileManager fileMgr = 
				complier.getStandardFileManager(null, null, null);
		//��ȡ�ļ�
		Iterable units = fileMgr.getJavaFileObjects(filename);
		//��������
		CompilationTask t = complier.getTask(null, fileMgr, null, null, null, units);
		//���б���
		t.call();
		fileMgr.close();
		
		//load ���ڴ�
		ClassLoader cl = ClassLoader.getSystemClassLoader();
		Class c = cl.loadClass("com.imooc.proxy.$Proxy0");
		
		Constructor ctr = c.getConstructor(infce);
		return ctr.newInstance(new Car());
	}

	
	
	
}
