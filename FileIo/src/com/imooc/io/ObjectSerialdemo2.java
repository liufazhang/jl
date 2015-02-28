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
		 * 反序列化是否递归调用父类的构造函数
		 * 结论：
		 * 对子类对象进行反序列化操作时，如果其父类没有实现序列化接口
		 * 那么其父类的构造函数会被显式调用
		 */
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("D:\\java\\FileIo\\demo\\ObjectSerialdemo2.txt"));
		Foo2 foo3 = (Foo2)ois.readObject();
		System.out.println(foo3);
		ois.close();
	}
}

/*
 * 一个类实现了序列化接口，那么其子类都可以进行序列化
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
