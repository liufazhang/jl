package com.imooc.io;

import java.io.FileInputStream;
import java.io.IOException;

public class IOUtil {

	/*
	 * ��ȡָ���ļ����ݣ�����16�������������̨
	 * ÿ���10��byte����
	 */
	public static void printHex (String fileName)throws IOException{
		FileInputStream in = new FileInputStream(fileName);
		int b;
		int i =1;
		while((b=in.read())!=-1){
			if(b<=0xf){
				System.out.print("0");
			}
			System.out.print(Integer.toHexString(b)+" ");
			if(i++%10==0){
				System.out.println();
			}
		}
		in.close();
	}
}
