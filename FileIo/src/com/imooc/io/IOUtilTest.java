package com.imooc.io;

import java.io.File;
import java.io.IOException;

public class IOUtilTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//IOUtil.printHex("D:\\java\\FileIo\\src\\com\\imooc\\io\\FileUtils.java");
		//IOUtil.printHexByByteArray("D:\\java\\FileIo\\src\\com\\imooc\\io\\FileUtils.java");
		
		//IOUtil.copyFile(new File("D:\\java\\FileIo\\demo\\imooc.txt"), new File("D:\\java\\FileIo\\demo\\imooc1.txt"));
		IOUtil.copyFileByBuffer(new File("D:\\java\\FileIo\\src\\com\\imooc\\io\\IOUtil.java"), new File("D:\\java\\FileIo\\demo\\IOUtil.txt"));
	}

}
