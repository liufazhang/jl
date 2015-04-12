package com.imooc.collection;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {

	/*
	 * ���з���Course ��List��������
	 */
	public List<Course> courses; 
	
	public TestGeneric(){
		this.courses = new ArrayList<Course>();
		
	}
	/*
	 * �������
	 */
	public void testAdd(){
		Course cr1 = new Course("1","English");
		courses.add(cr1);
		/*
		 * ���ͼ����У�������ӷ��͹涨�����ͼ�������������Ķ��󣬷����������ʾ����
		 */
		//courses.add("iss");
		Course cr2 = new Course("2","Chinese");
		courses.add(cr2);
	}
	
	public void testForEach(){
		/*
		 * ���͵���һ���ô���List�еĶ����Ƿ���ָ���Ķ���Course��������Object,ȡ��ֱ��ʹ��
		 */
		for(Course cr:courses){
			System.out.println(cr.id+":"+cr.name);
		}
	}
	
	/*
	 * ���ͼ��Ͽ�����ӷ��͵������͵Ķ���ʵ��
	 */
	public void testChild(){
		ChildCourse ccr = new ChildCourse();
		ccr.id ="3";
		ccr.name = "���������͵Ŀγ̶���ʵ��";
		courses.add(ccr);
	}
	/*
	 * ���Ͳ���ʹ�û�������
	 */
	public void testBasic(){
		//List<int> list = new ArrayList<int>();
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);//�����ǿ��ת��ΪInteger
		System.out.println("�������ͱ���ʹ�����װ����Ϊ����"+list.get(0));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGeneric tg = new TestGeneric();
		tg.testAdd();
		tg.testForEach();
		tg.testChild();
		tg.testForEach();
		tg.testBasic();
	}

}
