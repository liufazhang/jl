package com.imooc.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("hello");
		//list1.add(20);���� 
		Class c1 = list.getClass();
		Class c2 = list1.getClass();
		System.out.println(c1==c2);
		/*
		 * ����Ĳ������Ǳ���֮��Ĳ���������ʱ
		 * c1==c2����true��˵������֮�󼯺ϵķ�����ȥ���ͻ���
		 * java�еļ��Ϸ��ͣ��Ƿ�ֹ��������ģ�ֻ�ڱ���׶���Ч���ƹ��������Ч��
		 * ��֤��ͨ�������ķ������������ƹ�����
		 */
		try {
			Method m = c2.getMethod("add",Object.class);
			m.invoke(list1,20);
			System.out.println(list1);
			/*
			 * ������foreach�����ˣ���int����
			
			for(String str:list1){
				System.out.println(str);
			}
			
			 */
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
	}

}
