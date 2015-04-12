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
			System.out.println("������ѧ��ID");
			String ID = console.next();
			//�ж�ID�Ƿ��Ѿ���ռ��
			Student st = students.get(ID);
			if(st == null){
				System.out.println("������ѧ������");
				String name = console.next();
				Student newStudent = new Student(ID,name);
				//ͨ��put���������ID-ѧ��ӳ��
				students.put(ID, newStudent);
				System.out.println("�ɹ����ѧ����"+students.get(ID).name);
				i++;				
			}else{
				System.out.println("��ѧ��ID�Ѿ���ռ��");
			}
		}
	}
	/*
	 * ����Map��keySet����
	 * 
	 */
	public void testKeySet(){
		Set<String> keySet = students.keySet();
		//ȡ��students������"
		System.out.println("�ܹ��У�"+students.size()+"��ѧ��");
		//����KeySet,ȡ��ÿһ�������ٵ���get����ȡ��ÿ������Ӧ��val
		for(String stuId:keySet){
			Student st = students.get(stuId);
			if(st!=null){
				System.out.println("ѧ����"+st.name);
			}
		}
	}
	/*
	 * ����ɾ��Map�е�ӳ��
	 */
	public void testRemove(){
		System.out.println("������Ҫɾ��ѧ����ID");
		Scanner console = new Scanner(System.in);
		while(true){	
		
			String ID = console.next();
			Student st = students.get(ID);
			if(st == null){
				System.out.println("��ѧ��ID������");
				continue;
			}
			students.remove(ID);
			System.out.println("�ɹ�ɾ��ѧ����"+st.name);
			break;
		}
	}
	
	/*
	 * entrySet����������Map
	 */
	public void testEntrySet(){
		Set<Entry<String,Student>> entryset = students.entrySet();
		for(Entry<String,Student> entry:entryset){
			System.out.println("key:"+entry.getKey());
			System.out.println("val:"+entry.getValue().name);
		}
	}
	/*
	 * ����put�����޸�Map���Ѿ��е�ӳ��
	 */
	public void testModify(){
		System.out.println("������ѧ��ID:");
		Scanner console = new Scanner(System.in);
		while(true){
			String stuID = console.next();
			Student student = students.get(stuID);
			if(student == null){
				System.out.println("��ѧ��ID������");
				continue;
			}
			System.out.println("������ѧ������");
			String name = console.next();
			Student newStudent = new Student(stuID,name);
			students.put(stuID, newStudent);
			break;
		}
	}
	
	/*
	 * ����Map�У��Ƿ����ĳ��key��valueֵ
	 */
	public void testContainsKeyOrValue() {
		System.out.println("������Ҫ��ѯ��ѧ��ID");
		String id = console.next();
		System.out.println("�������ѧ��IDΪ��"+ id +"��ѧ��ӳ������Ƿ���ڣ�"+students.containsKey(id));
		if(students.containsKey(id)){
			System.out.println("��Ӧ��ѧ������Ϊ��"+students.get(id).name);
		}
		System.out.println("������Ҫ��ѯ��ѧ������");
		String name = console.next();
		//Map�е�contains������list��setһ�����������equal������Ҫ��д
		System.out.println("ӳ������Ƿ����ѧ����"+students.containsValue(new Student(null,name)));
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
