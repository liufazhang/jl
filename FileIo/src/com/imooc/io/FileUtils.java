package com.imooc.io;

import java.io.File;
import java.io.IOException;

//列出File的一些常用操作，比如过滤，遍历等操作
public class FileUtils {
	
	/*
	 * 列出指定目录下的所有文件，包括子目录
	 */

	public static void listDeirectory(File dir) throws IOException{
		if(!dir.exists()){
			throw new IllegalArgumentException("目录："+ dir +"not exist");
		}
		if(!dir.isDirectory()){
			throw new IllegalArgumentException(dir + "not directory");
		}
		/*String[] filenames = dir.list();//返回的是字符串数组，直接子的名称，不包含目录内容
		for(String st:filenames){
			System.out.println(st);
		}
		*/
		//如果要遍历目录上的内容，就需要构造成File对像做递归操作，
		File[] files = dir.listFiles();//返回的是直接子目录、文件的抽象
		for(File file:files){
			if(file.isDirectory()){
				listDeirectory(file);
			}else{
				System.out.println(file);
			}
		}
	}
	
}
