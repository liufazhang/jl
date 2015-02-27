package com.imooc.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DosDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String file = "D:\\java\\FileIo\\demo\\dos.txt";
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
		dos.writeInt(10);
		dos.writeInt(-10);
		dos.writeLong(10l);
		dos.writeDouble(10.5);
		//utf-8д��
		dos.writeUTF("�й�");
		//utf-16beд��
		dos.writeChars("�й�");
		dos.close();
		IOUtil.printHex(file);
	}

}
