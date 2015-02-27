package com.imooc.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub		
		FileOutputStream out = new FileOutputStream("demo/out.dat",true);//true，文件存在，则追加内容
		out.write('A');//写出了A字符的低8位
		int a = 10;//write方法只能写低8位，写一个整数需要写4次
		out.write(a>>>24);
		out.write(a>>>16);
		out.write(a>>>8);
		out.write(a);
		byte[] gbk = "中国".getBytes("gbk");
		out.write(gbk);
		out.close();
		IOUtil.printHex("demo/out.dat");
		
	}

}
