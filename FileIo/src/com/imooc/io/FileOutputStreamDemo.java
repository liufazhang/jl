package com.imooc.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub		
		FileOutputStream out = new FileOutputStream("demo/out.dat",true);//true���ļ����ڣ���׷������
		out.write('A');//д����A�ַ��ĵ�8λ
		int a = 10;//write����ֻ��д��8λ��дһ��������Ҫд4��
		out.write(a>>>24);
		out.write(a>>>16);
		out.write(a>>>8);
		out.write(a);
		byte[] gbk = "�й�".getBytes("gbk");
		out.write(gbk);
		out.close();
		IOUtil.printHex("demo/out.dat");
		
	}

}
