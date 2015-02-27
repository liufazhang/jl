package com.imooc.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FrAndFwDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("D:\\java\\FileIo\\src\\com\\imooc\\io\\IOUtil.java");
		//FileWriter fw = new FileWriter("D:\\java\\FileIo\\demo\\fw.txt");
		FileWriter fw = new FileWriter("D:\\java\\FileIo\\demo\\fw.txt",true);//append
		char[] buffer = new char[512];
		int c;
		while((c=fr.read(buffer,0,buffer.length))!=-1){			
			fw.write(buffer,0,c);
			fw.flush();
		}
		fr.close();
		fw.close();
		
	}

}
