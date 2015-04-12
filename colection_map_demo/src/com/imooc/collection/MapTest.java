package com.imooc.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
	
	public Map<String,Student> students;
	public Scanner console;
	public MapTest() {
		// TODO Auto-generated constructor stub
		this.students = new HashMap<String,Student>();
		this.console = new Scanner(System.in);
	}
	public void testPut(){
		Scanner console = new Scanner(System.in);
		int i=0;
		while(i<3){
			System.out.println("请输入学生ID");
			String ID = console.next();
			//判断ID是否已经被占用
			Student st = students.get(ID);
			if(st == null){
				System.out.println("请输入学生姓名");
				String name = console.next();
				Student newStudent = new Student(ID,name);
				//通过put方法，添加ID-学生映射
				students.put(ID, newStudent);
				System.out.println("成功添加学生："+students.get(ID).name);
				i++;				
			}else{
				System.out.println("该学生ID已经被占用");
			}
		}
	}
	/*
	 * 测试Map的keySet方法
	 * 
	 */
	public void testKeySet(){
		Set<String> keySet = students.keySet();
		//取得students的容量"
		System.out.println("总共有："+students.size()+"个学生");
		//遍历KeySet,取得每一个键，再调用get方法取得每个键对应的val
		for(String stuId:keySet){
			Student st = students.get(stuId);
			if(st!=null){
				System.out.println("学生："+st.name);
			}
		}
	}
	/*
	 * 测试删除Map中的映射
	 */
	public void testRemove(){
		System.out.println("请输入要删除学生的ID");
		Scanner console = new Scanner(System.in);
		while(true){	
		
			String ID = console.next();
			Student st = students.get(ID);
			if(st == null){
				System.out.println("该学生ID不存在");
				continue;
			}
			students.remove(ID);
			System.out.println("成功删除学生："+st.name);
			break;
		}
	}
	
	/*
	 * entrySet方法来遍历Map
	 */
	public void testEntrySet(){
		Set<Entry<String,Student>> entryset = students.entrySet();
		for(Entry<String,Student> entry:entryset){
			System.out.println("key:"+entry.getKey());
			System.out.println("val:"+entry.getValue().name);
		}
	}
	/*
	 * 利用put方法修改Map中已经有的映射
	 */
	public void testModify(){
		System.out.println("请输入学生ID:");
		Scanner console = new Scanner(System.in);
		while(true){
			String stuID = console.next();
			Student student = students.get(stuID);
			if(student == null){
				System.out.println("该学生ID不存在");
				continue;
			}
			System.out.println("请输入学生姓名");
			String name = console.next();
			Student newStudent = new Student(stuID,name);
			students.put(stuID, newStudent);
			break;
		}
	}
	
	/*
	 * 测试Map中，是否存在某个key或value值
	 */
	public void testContainsKeyOrValue() {
		System.out.println("请输入要查询的学生ID");
		String id = console.next();
		System.out.println("您输入的学生ID为："+ id +"在学生映射表中是否存在："+students.containsKey(id));
		if(students.containsKey(id)){
			System.out.println("对应的学生名字为："+students.get(id).name);
		}
		System.out.println("请输入要查询的学生姓名");
		String name = console.next();
		//Map中的contains方法和list，set一样，都会调用equal方法，要重写
		System.out.println("映射表中是否存在学生："+students.containsValue(new Student(null,name)));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapTest mt = new MapTest();
		mt.testPut();
		mt.testKeySet();
		//mt.testRemove();
		//mt.testModify();
		//mt.testEntrySet();
		mt.testContainsKeyOrValue();
	}

}
