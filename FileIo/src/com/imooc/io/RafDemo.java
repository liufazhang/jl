package com.imooc.io;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class RafDemo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File demo = new File("demo");
		if(!demo.exists()){
			demo.mkdir();
			File file = new File(demo,"raf.txt");
			if(!file.exists()){				
					file.createNewFile();			
				
				}
			RandomAccessFile raf = new RandomAccessFile(file,"rw");
			System.out.println(raf.getFilePointer());
			raf.write('A');
			System.out.println(raf.getFilePointer());
			raf.write('b');
			
			int i = 0x7fffffff;
			//用write方法，每次只能写一个字节，如果要把i写进去，要写四次
			raf.write(i>>>24);//高8位
			raf.write(i>>>16);
			raf.write(i>>>8);
			raf.write(i);
			System.out.println(raf.getFilePointer());
			//可以直接写一个int
			raf.writeInt(i);
			
			System.out.println(raf.getFilePointer());
			String s = "国";
			byte[] gbk = s.getBytes("gbk");
			raf.write(gbk);
			
			System.out.println(raf.length());
			//读文件，必须把指针移动到头部
			raf.seek(0);
			byte[] buf = new byte[(int)raf.length()];//读出为字节数组65, 98, 127, -1, -1, -1, 127, -1, -1, -1, -71, -6
			
			raf.read(buf);
			System.out.println(Arrays.toString(buf));
			String s1 = new String(buf);//转换成字符串，会有乱码，因为中文前后有其它字符使用不同编码
			System.out.println(s1);
			
			for(byte b:buf){
				System.out.println(Integer.toHexString(b&0xff));//转为16进制
			}
			
			raf.close();
			
		}
	}

}
