package com.imooc.io;

import java.io.Serializable;

public class Student implements Serializable  {
	/*
	 *  transient ��Ԫ�ز������jvmĬ�ϵ����л�,�����л�ʱ������Ϊ����Ĭ��ֵ null
	 *  Ҳ�����Լ�������Ԫ�ص����л�
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
		 s.defaultWriteObject();//��jvm��Ĭ�����л���Ԫ�ؽ������л�
		 s.writeInt(age);//�Լ����л�age
		
	 }
	  private void readObject(java.io.ObjectInputStream s)
		        throws java.io.IOException, ClassNotFoundException {
		  s.defaultReadObject();//��jvm��Ĭ�Ϸ����л���Ԫ�ؽ��з����л�����
		  this.age = s.readInt();//�Լ����age�ķ����л����� 
  
	  }
	
}
