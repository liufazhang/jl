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
			//��write������ÿ��ֻ��дһ���ֽڣ����Ҫ��iд��ȥ��Ҫд�Ĵ�
			raf.write(i>>>24);//��8λ
			raf.write(i>>>16);
			raf.write(i>>>8);
			raf.write(i);
			System.out.println(raf.getFilePointer());
			//����ֱ��дһ��int
			raf.writeInt(i);
			
			System.out.println(raf.getFilePointer());
			String s = "��";
			byte[] gbk = s.getBytes("gbk");
			raf.write(gbk);
			
			System.out.println(raf.length());
			//���ļ��������ָ���ƶ���ͷ��
			raf.seek(0);
			byte[] buf = new byte[(int)raf.length()];//����Ϊ�ֽ�����65, 98, 127, -1, -1, -1, 127, -1, -1, -1, -71, -6
			
			raf.read(buf);
			System.out.println(Arrays.toString(buf));
			String s1 = new String(buf);//ת�����ַ������������룬��Ϊ����ǰ���������ַ�ʹ�ò�ͬ����
			System.out.println(s1);
			
			for(byte b:buf){
				System.out.println(Integer.toHexString(b&0xff));//תΪ16����
			}
			
			raf.close();
			
		}
	}

}
