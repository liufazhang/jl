package com.imooc.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsTest {
	/*
	 * 将要完成：
	 * 1、通过Collections.sort()方法，对Integer泛型的List进行排序
	 * 2、对String泛型的List进行排序
	 * 3、对其它类型泛型的List进行排序，以Student为例
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionsTest ct = new CollectionsTest();
		//ct.testSort1();
		//ct.testSortString();
		ct.testSort3();
	}
	
	/*
	 *  1、通过Collections.sort()方法，对Integer泛型的List进行排序
	 *  创建一个Integer泛型的List，插入100以内的不重复随机数
	 */
	public void testSort1(){
		List<Integer> integerList = new ArrayList<Integer>();
		Random random = new Random();
		Integer k;
		for(int i = 0;i < 10;i++){
			do{
				k = random.nextInt(100);
			}while(integerList.contains(k));
			integerList.add(k);
			System.out.println("成功添加整数："+k);
		}
		System.out.println("-------------排序前-------");
		for(Integer it:integerList){
			System.out.println("元素："+it);
		}
		
		Collections.sort(integerList);
		System.out.println("-------------排序后-------");
		for(Integer it:integerList){
			System.out.println("元素："+it);
		}
	}
	//2、对String泛型的List进行排序
	public void testSortString(){
		List<String> stringList = new ArrayList<String>();
		stringList.add("micosoft");
		stringList.add("google");
		stringList.add("lenovo");
		System.out.println("-------------排序前-------");
		for(String st:stringList){
			System.out.println("元素："+st);
		}
		System.out.println("-------------排序后-------");
		Collections.sort(stringList);
		for(String st:stringList){
			System.out.println("元素："+st);
		}
	}
	
	public void testSort3(){
		List<Student> stList = new ArrayList<Student>();
		Random random = new Random();
		
		stList.add(new Student(random.nextInt(1000)+"","mike"));
		stList.add(new Student(random.nextInt(1000)+"","rocky"));
		stList.add(new Student(random.nextInt(1000)+"","angela"));
		stList.add(new Student(10000+"","json"));
		System.out.println("-------------排序前-------");
		for(Student st:stList){
			System.out.println("学生："+st.id+":"+st.name);
		}
		//Collections.sort(stList);编译错误，Collections.sort的参数对象必须实现Comparable接口，这里要Student实现Comparable接口
		Collections.sort(stList);
		System.out.println("------------id-排序后-------");
		for(Student st:stList){
			System.out.println("学生："+st.id+":"+st.name);
		}
		System.out.println("-------------按照名字排序后-------");
		Collections.sort(stList,new StudentComparator());
		for(Student st:stList){
			System.out.println("学生："+st.id+":"+st.name);
		}
	}
	/**

	 * 练习：

	 * 利用Collections.sort()方法对泛型为String的List进行排序

	 * 1.创建完List<String> 之后，往其中添加十条随机字符串

	 * 2.每条字符串的长度为10以内的随机整数

	 * 3.每条字符串的每个字符为随机生成的字符，字符可以重复

	 * 4.每条随机字符串不可以重复
	 * */

}
