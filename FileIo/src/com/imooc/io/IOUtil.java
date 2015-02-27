package com.imooc.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOUtil {

	/*
	 * ��ȡָ���ļ����ݣ�����16�������������̨
	 * ÿ���10��byte����
	 * ���ֽڶ�ȡ�����ʺ϶����ļ���Ч�ʵ�
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
	
	public static void printHexByByteArray(String filename) throws IOException{
		FileInputStream in = new FileInputStream(filename);
		byte[] buf = new byte[20*1024];
		/*
		 * ��in ��������ȡ�ֽڣ����뵽buf��������У�
		 * �ӵ�0��λ�ÿ�ʼ�ţ�����buf.length��
		 * ���ص��Ƕ�ȡ���ֽڵĸ���
		 * ��ȡ���ļ�����Ч��
		 */
		/*
		int bytes = in.read(buf,0,buf.length);
		int j =1;
		for(int i = 0; i < bytes; i++){
			if(buf[i]<=0xf){
				System.out.print("0");
				
			}
			System.out.print(Integer.toHexString(buf[i]&0xff)+" ");
			if(j++%10 == 0){
				System.out.println();
			}
		}
		*/
		int bytes = 0;
		int j = 1;
		while((bytes = in.read(buf,0,buf.length))!=-1){
			System.out.println(bytes);
			for(int i = 0;i < bytes;i++){
				System.out.print(Integer.toHexString(buf[i]&0xff)+" ");//byte����8λ��int����32λ��Ϊ��������ת������ͨ��&0xff����24λ��0
				if(j++%10 == 0){
					System.out.println();
				}
			}
		}
		
		in.close();
		
	}
	
	public static void copyFile(File srcFile,File destFile)throws IOException{
		if(!srcFile.exists()){
			throw new IllegalArgumentException("�ļ�������");
		}
		if(!srcFile.isFile()){
			throw new IllegalArgumentException(srcFile +"�����ļ�");
		}
		FileInputStream in = new FileInputStream(srcFile);
		FileOutputStream out = new FileOutputStream(destFile);
		byte[] buf = new byte[8*1024];
		int b;
		while((b = in.read(buf,0,buf.length))!=-1){
			out.write(buf,0,b);
			out.flush();//FileOutputStream.flush��ʵʲôҲ����
		}
		in.close();
		out.close();
	}
	
	public static void copyFileByBuffer(File srcFile,File desFile) throws IOException{
		if(!srcFile.exists()){
			throw new IllegalArgumentException("�ļ�������");
		}
		if(!srcFile.isFile()){
			throw new IllegalArgumentException(srcFile +"�����ļ�");
		}
		
		BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream(srcFile));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(desFile));
		int c ;
		while((c=bis.read())!=-1){
			bos.write(c);
			bos.flush();//ˢ�»�����������д�벻��
		}
		bis.close();
		bos.close();
	}
	
	
}
