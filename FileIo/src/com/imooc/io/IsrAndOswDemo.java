package com.imooc.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IsrAndOswDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream in = new FileInputStream("D:\\java\\FileIo\\src\\com\\imooc\\io\\IOUtil.java");
		//InputStreamReader isr = new InputStreamReader(in);//Ĭ����Ŀ�ı��룬���ļ�ʱ��Ҫ�����ļ�����ı��������������
		InputStreamReader isr = new InputStreamReader(in,"gbk");
		FileOutputStream out = new FileOutputStream("D:\\java\\FileIo\\demo\\isr.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out);
		/* һ��һ����ȡһ���ַ�
		int c;
		while((c=isr.read())!=-1){
			System.out.print((char)c);
		}
		*/
		
		/*
		 * ������ȡ������buffer����
		 */
		char[] buffer = new char[8*1024];
		int c;
		while((c = isr.read(buffer,0,buffer.length))!=-1){
			String s = new String(buffer,0,c);
			System.out.print(s);
			osw.write(buffer,0,c);
			osw.flush();
		}
		isr.close();
		osw.close();
		
	}

}
