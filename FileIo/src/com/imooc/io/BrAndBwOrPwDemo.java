package com.imooc.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class BrAndBwOrPwDemo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(
				new InputStreamReader(
						new FileInputStream("D:\\java\\FileIo\\src\\com\\imooc\\io\\IOUtil.java")));
		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(
						new FileOutputStream("D:\\java\\FileIo\\demo\\brbspw.txt")));
		PrintWriter pw = new PrintWriter("D:\\java\\FileIo\\demo\\brbspw1.txt");
		String line;
		while((line = br.readLine())!=null){
			System.out.println(line);//һ�ζ�һ�У�������ʶ����
			bw.write(line);
			bw.newLine();//����д���в���
			bw.flush();
			pw.println(line);
		}
		bw.close();
		br.close();
		pw.close();
	}

}
