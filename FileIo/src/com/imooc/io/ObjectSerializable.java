package com.imooc.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectSerializable {

	public static void main(String[] args) throws  Exception {
		// TODO Auto-generated method stub
		String file = "demo/obj.txt";
		/*
		 * 对象序列化
		 * 
		 */
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(file));
		Student stu = new Student("100001","yyy",21);
		oos.writeObject(stu);
		oos.flush();
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(file));
		Student stu1 = (Student)ois.readObject();
		System.out.println(stu1);
		ois.close();
	}

}
