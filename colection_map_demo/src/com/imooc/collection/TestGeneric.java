package com.imooc.collection;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {

	/*
	 * 带有泛型Course 的List类型属性
	 */
	public List<Course> courses; 
	
	public TestGeneric(){
		this.courses = new ArrayList<Course>();
		
	}
	/*
	 * 测试添加
	 */
	public void testAdd(){
		Course cr1 = new Course("1","English");
		courses.add(cr1);
		/*
		 * 泛型集合中，不能添加泛型规定的类型及其子类型以外的对象，否则编译器提示错误
		 */
		//courses.add("iss");
		Course cr2 = new Course("2","Chinese");
		courses.add(cr2);
	}
	
	public void testForEach(){
		/*
		 * 泛型的另一个好处，List中的对象是泛型指定的对象Course，而不是Object,取出直接使用
		 */
		for(Course cr:courses){
			System.out.println(cr.id+":"+cr.name);
		}
	}
	
	/*
	 * 泛型集合可以添加泛型的子类型的对象实例
	 */
	public void testChild(){
		ChildCourse ccr = new ChildCourse();
		ccr.id ="3";
		ccr.name = "我是子类型的课程对象实例";
		courses.add(ccr);
	}
	/*
	 * 泛型不能使用基本类型
	 */
	public void testBasic(){
		//List<int> list = new ArrayList<int>();
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);//这里会强制转换为Integer
		System.out.println("基本类型必须使用其包装类作为泛型"+list.get(0));
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
