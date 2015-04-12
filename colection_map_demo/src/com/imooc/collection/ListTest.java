package com.imooc.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {
	/*
	 * 存放备选课程的List
	 */
	public List coursesToSelect;
	
	public ListTest(){
		this.coursesToSelect = new ArrayList();
	}
	/*
	 * 用于往coursesToSelect中添加课程
	 */
	public void testAdd(){
		Course cr1 = new Course("1","数据结构");
		coursesToSelect.add(cr1);
		Course tmp = (Course)coursesToSelect.get(0);//对象存入集合都变成object类型，取出时需要要类型转换		
		System.out.println(tmp.id + ":"+ tmp.name);
		
		Course cr2 = new Course("2","C 语言");
		coursesToSelect.add(1,cr2);
		Course tmp2 = (Course)coursesToSelect.get(1);
		System.out.println(tmp2.id + ":"+ tmp2.name);
		
		Course[] course = {new Course("3","java"),new Course("4","PHP")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course tmp3 = (Course)coursesToSelect.get(2);
		Course tmp4 = (Course)coursesToSelect.get(3);
		System.out.println("添加了两门课程"+tmp3.id + ":"+ tmp3.name+" and "+tmp4.id + ":"+ tmp4.name);
		Course[] course2 = {new Course("5","html"),new Course("6","mysql")};
		coursesToSelect.addAll(2,Arrays.asList(course2));
		Course tmp5 = (Course)coursesToSelect.get(2);
		Course tmp6 = (Course)coursesToSelect.get(3);
		System.out.println("添加了两门课程"+tmp5.id + ":"+ tmp5.name+" and "+tmp6.id + ":"+ tmp6.name);
	}
	/*
	 * for 遍历List
	 */
	public void testGet(){
		int size = coursesToSelect.size();
		System.out.println("有如下待选课程");
		for(int i = 0 ; i<size;i++){
			Course cr = (Course)coursesToSelect.get(i);
			System.out.println("课程id："+ cr.id + " 课程名称："+ cr.name);
		}
	}
	
	/*
	 * 通过迭代器遍历List
	 * Iterator
	 */
	public void testIterator(){
		Iterator it = coursesToSelect.iterator();
		while(it.hasNext()){
			Course cr = (Course)it.next();
			System.out.println("课程id："+ cr.id + " 课程名称："+ cr.name);

			
		}
	}
	
	/*
	 * 通过for each方法遍历集合元素
	 */
	public void testForEach(){
		for(Object obj:coursesToSelect){
			Course cr = (Course)obj;
			System.out.println("课程id："+ cr.id + " 课程名称："+ cr.name);

			
		}
	}
	/*
	 * 修改List
	 */
	public void testModify(){
		coursesToSelect.set(4,new Course("5","python"));
	}
			
	public static void test(){
		System.out.println("test");
		
	}
	/*
	 * 删除List中的元素
	 */
	public void testRemove(){
		Course cr = (Course)coursesToSelect.get(4);
		System.out.println("我是课程："+cr.id+":"+cr.name);
		coursesToSelect.remove(cr);//也可以直接coursesToSelect.remove(4)
		System.out.println("删除课程成功");
		testForEach();
		
		Course[] course ={(Course)coursesToSelect.get(2),(Course)coursesToSelect.get(3)};
		coursesToSelect.removeAll(Arrays.asList(course));//Arrays.asList 将数组转化成List,removeall将List 删除掉给定的List子集中所有元素
		testForEach();
		
	}
	/*
	 * 往List中添加一些非Course对象,遍历时会抛出异常，因为遍历时会强制转换成Course
	 * 使用泛型，List中只能添加泛型中指定的对象类型，如不是则，编译器报错
	 */
	public void testType(){
		coursesToSelect.add("我不是课程，只是字符串");
		
	}
	public static void main(String[] args){
		ListTest lt = new ListTest();
		lt.testAdd();
		//lt.testGet();
		//lt.testIterator();
		//lt.testForEach();
		//lt.testModify();
		//lt.testForEach();
		//lt.testRemove();
		lt.testType();
		lt.testIterator();
		
		
		
	}
}
