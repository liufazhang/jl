package com.imooc.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectSerialdemo2 {
	public static void main(String[] args) throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("D:\\java\\FileIo\\demo\\ObjectSerialdemo2.txt"));
		Foo2 foo2 = new Foo2();
		oos.writeObject(foo2);
		oos.flush();
		oos.close();
		
		/*
		 * �����л��Ƿ�ݹ���ø���Ĺ��캯��
		 * ���ۣ�
		 * �����������з����л�����ʱ������丸��û��ʵ�����л��ӿ�
		 * ��ô�丸��Ĺ��캯���ᱻ��ʽ����
		 */
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("D:\\java\\FileIo\\demo\\ObjectSerialdemo2.txt"));
		Foo2 foo3 = (Foo2)ois.readObject();
		System.out.println(foo3);
		ois.close();
	}
}

/*
 * һ����ʵ�������л��ӿڣ���ô�����඼���Խ������л�
 */
class Foo implements Serializable{
	public Foo(){
		System.out.println("FOO..");
	}
}

class Foo1 extends Foo{
	public Foo1(){
		System.out.println("FOO1..");
	}
}

class Foo2 extends Foo1{
	public Foo2(){
		System.out.println("FOO2..");
	}
}
