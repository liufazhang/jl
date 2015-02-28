package com.imooc.io;

import java.io.Serializable;

public class Student implements Serializable  {
	/*
	 *  transient 该元素不会进行jvm默认的序列化,反序列化时，读出为类型默认值 null
	 *  也可以自己完成这个元素的序列化
	 */
	private transient String stuno;
	private String stuname;
	private transient int age;
	
	public Student(){
		
	}
	public Student(String stuno, String stuname, int age) {
		super();
		this.stuno = stuno;
		this.stuname = stuname;
		this.age = age;
	}
	public String getStuno() {
		return stuno;
	}
	public void setStuno(String stuno) {
		this.stuno = stuno;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [stuno=" + stuno + ", stuname=" + stuname + ", age="
				+ age + "]";
	}
	
	 private void writeObject(java.io.ObjectOutputStream s)
		        throws java.io.IOException{
		 s.defaultWriteObject();//把jvm能默认序列化的元素进行序列化
		 s.writeInt(age);//自己序列化age
		
	 }
	  private void readObject(java.io.ObjectInputStream s)
		        throws java.io.IOException, ClassNotFoundException {
		  s.defaultReadObject();//把jvm能默认反序列化的元素进行反序列化操作
		  this.age = s.readInt();//自己完成age的反序列化操作 
  
	  }
	
}
