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
		//InputStreamReader isr = new InputStreamReader(in);//默认项目的编码，读文件时，要按照文件本身的编码读，否则乱码
		InputStreamReader isr = new InputStreamReader(in,"gbk");
		FileOutputStream out = new FileOutputStream("D:\\java\\FileIo\\demo\\isr.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out);
		/* 一次一个读取一个字符
		int c;
		while((c=isr.read())!=-1){
			System.out.print((char)c);
		}
		*/
		
		/*
		 * 批量读取，放入buffer数组
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
