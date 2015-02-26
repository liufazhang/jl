package com.imooc.io;

import java.io.File;
import java.io.IOException;

//�г�File��һЩ���ò�����������ˣ������Ȳ���
public class FileUtils {
	
	/*
	 * �г�ָ��Ŀ¼�µ������ļ���������Ŀ¼
	 */

	public static void listDeirectory(File dir) throws IOException{
		if(!dir.exists()){
			throw new IllegalArgumentException("Ŀ¼��"+ dir +"not exist");
		}
		if(!dir.isDirectory()){
			throw new IllegalArgumentException(dir + "not directory");
		}
		/*String[] filenames = dir.list();//���ص����ַ������飬ֱ���ӵ����ƣ�������Ŀ¼����
		for(String st:filenames){
			System.out.println(st);
		}
		*/
		//���Ҫ����Ŀ¼�ϵ����ݣ�����Ҫ�����File�������ݹ������
		File[] files = dir.listFiles();//���ص���ֱ����Ŀ¼���ļ��ĳ���
		for(File file:files){
			if(file.isDirectory()){
				listDeirectory(file);
			}else{
				System.out.println(file);
			}
		}
	}
	
}
