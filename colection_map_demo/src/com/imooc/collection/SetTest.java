package com.imooc.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {

	public List<Course> coursesToSelect;
	public Scanner console;
	public Student student;
	public SetTest(){
		coursesToSelect = new ArrayList<Course>();
		console = new Scanner(System.in);
		
	}
	public void testAdd(){
		Course cr1 = new Course("1","数据结构");
		coursesToSelect.add(cr1);
		Course tmp = (Course)coursesToSelect.get(0);//对象存入集合都变成object类型，取出时需要要类型转换		
		//System.out.println(tmp.id + ":"+ tmp.name);
		
		Course cr2 = new Course("2","C 语言");
		coursesToSelect.add(1,cr2);
		Course tmp2 = (Course)coursesToSelect.get(1);
		//System.out.println(tmp2.id + ":"+ tmp2.name);
		
		Course[] course = {new Course("3","java"),new Course("4","PHP")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course tmp3 = (Course)coursesToSelect.get(2);
		Course tmp4 = (Course)coursesToSelect.get(3);
		//System.out.println("添加了两门课程"+tmp3.id + ":"+ tmp3.name+" and "+tmp4.id + ":"+ tmp4.name);
		Course[] course2 = {new Course("5","html"),new Course("6","mysql")};
		coursesToSelect.addAll(2,Arrays.asList(course2));
		Course tmp5 = (Course)coursesToSelect.get(2);
		Course tmp6 = (Course)coursesToSelect.get(3);
		//System.out.println("添加了两门课程"+tmp5.id + ":"+ tmp5.name+" and "+tmp6.id + ":"+ tmp6.name);
	}
	public void testForEach(){
		for(Object obj:coursesToSelect){
			Course cr = (Course)obj;
			//Course cr = obj;
			System.out.println("课程id："+ cr.id + " 课程名称："+ cr.name);

			
		}
	}
	public void testForEachForSet(Student student){
		//打印输出，学生所选的课程,遍历Set 只能用for each 和Iterator,不能用get(n)，因为是无序的
				for(Course cr:student.courses){
					System.out.println("选择了课程"+cr.name);
				}
	}
	
	/*
	 * 测试list的contains方法
	 */
	public void testListContains(){
		//从list中取出课程对象，contains方法返回true
		Course course = coursesToSelect.get(0);
		//System.out.println("取得课程："+course.name);
		//System.out.println(course.name+":"+coursesToSelect.contains(course));
		//创建和list中完全一样的课程对象，contains返回false，需要重写Course的equals方法
		Course cr2 = new Course(course.id,course.name);
		System.out.println(cr2.name+"::"+coursesToSelect.contains(cr2));
		System.out.println("请输入课程名称：");
		Course cr3 = new Course();
		String name = console.next();
		cr3.name= name;
		System.out.println("新建课程："+cr3.name);
		System.out.println("备选课程中是否包含课程："+cr3.name+coursesToSelect.contains(cr3));
		if(coursesToSelect.contains(cr3)){
			System.out.println("索引位置"+coursesToSelect.indexOf(cr3));//如果存在多个相同的元素，则返回第一个
		}
	}
	public void createStudentAndSelectCourse(){
		student = new Student("1", "小明");
		System.out.println("欢迎学生"+student.name+"选课");
		//创建一个Scanner对象，用来从键盘接收输入课程id
		Scanner console = new Scanner(System.in);		
		for(int i=0;i<3;i++){
			System.out.println("输入课程ID");
			String courseId = console.next();
			for(Course cr:coursesToSelect){
				if(cr.id.equals(courseId)){
					
					//  Set中，添加某个对象，无论添加多少次，最终只会保留一个
					//  该对象（的引用），并且，保留的是第一次添加的那一个
					
					
					student.courses.add(cr);
				}
			}
		}
		
	}
	public void testSetContains(){				
		System.out.println("请输入课程名称：");
		Course cr3 = new Course();
		String name = console.next();
		cr3.name= name;
		System.out.println("新建课程："+cr3.name);
		System.out.println("备选课程中是否包含课程："+cr3.name+student.courses.contains(cr3));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetTest st = new SetTest();
		st.testAdd();
		st.testForEach();
		st.testListContains();
		//st.createStudentAndSelectCourse();
		//st.testSetContains();
		//st.testForEach();
		/*
		Student student = new Student("1", "小明");
		System.out.println("欢迎学生"+student.name+"选课");
		//创建一个Scanner对象，用来从键盘接收输入课程id
		Scanner console = new Scanner(System.in);
		
		for(int i=0;i<3;i++){
			System.out.println("输入课程ID");
			String courseId = console.next();
			for(Course cr:st.coursesToSelect){
				if(cr.id.equals(courseId)){
					
					//  Set中，添加某个对象，无论添加多少次，最终只会保留一个
					//  该对象（的引用），并且，保留的是第一次添加的那一个
					
					
					student.courses.add(cr);
				}
			}
		}
		st.testForEachForSet(student);
		*/
	}

}
