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
	 * 读取指定文件内容，按照16进制输出到控制台
	 * 每输出10个byte换行
	 * 单字节读取，不适合读大文件，效率低
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
		 * 从in 中批量读取字节，放入到buf这个数组中，
		 * 从第0个位置开始放，最多放buf.length个
		 * 返回的是读取的字节的个数
		 * 读取大文件，高效高
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
				System.out.print(Integer.toHexString(buf[i]&0xff)+" ");//byte类型8位，int类型32位，为避免数据转换错误，通过&0xff将高24位清0
				if(j++%10 == 0){
					System.out.println();
				}
			}
		}
		
		in.close();
		
	}
	
	public static void copyFile(File srcFile,File destFile)throws IOException{
		if(!srcFile.exists()){
			throw new IllegalArgumentException("文件不存在");
		}
		if(!srcFile.isFile()){
			throw new IllegalArgumentException(srcFile +"不是文件");
		}
		FileInputStream in = new FileInputStream(srcFile);
		FileOutputStream out = new FileOutputStream(destFile);
		byte[] buf = new byte[8*1024];
		int b;
		while((b = in.read(buf,0,buf.length))!=-1){
			out.write(buf,0,b);
			out.flush();//FileOutputStream.flush其实什么也不做
		}
		in.close();
		out.close();
	}
	
	public static void copyFileByBuffer(File srcFile,File desFile) throws IOException{
		if(!srcFile.exists()){
			throw new IllegalArgumentException("文件不存在");
		}
		if(!srcFile.isFile()){
			throw new IllegalArgumentException(srcFile +"不是文件");
		}
		
		BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream(srcFile));
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream(desFile));
		int c ;
		while((c=bis.read())!=-1){
			bos.write(c);
			bos.flush();//刷新缓冲区，否则写入不到
		}
		bis.close();
		bos.close();
	}
	
	
}
