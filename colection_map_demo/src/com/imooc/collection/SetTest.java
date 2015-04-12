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
		Course cr1 = new Course("1","���ݽṹ");
		coursesToSelect.add(cr1);
		Course tmp = (Course)coursesToSelect.get(0);//������뼯�϶����object���ͣ�ȡ��ʱ��ҪҪ����ת��		
		//System.out.println(tmp.id + ":"+ tmp.name);
		
		Course cr2 = new Course("2","C ����");
		coursesToSelect.add(1,cr2);
		Course tmp2 = (Course)coursesToSelect.get(1);
		//System.out.println(tmp2.id + ":"+ tmp2.name);
		
		Course[] course = {new Course("3","java"),new Course("4","PHP")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course tmp3 = (Course)coursesToSelect.get(2);
		Course tmp4 = (Course)coursesToSelect.get(3);
		//System.out.println("��������ſγ�"+tmp3.id + ":"+ tmp3.name+" and "+tmp4.id + ":"+ tmp4.name);
		Course[] course2 = {new Course("5","html"),new Course("6","mysql")};
		coursesToSelect.addAll(2,Arrays.asList(course2));
		Course tmp5 = (Course)coursesToSelect.get(2);
		Course tmp6 = (Course)coursesToSelect.get(3);
		//System.out.println("��������ſγ�"+tmp5.id + ":"+ tmp5.name+" and "+tmp6.id + ":"+ tmp6.name);
	}
	public void testForEach(){
		for(Object obj:coursesToSelect){
			Course cr = (Course)obj;
			//Course cr = obj;
			System.out.println("�γ�id��"+ cr.id + " �γ����ƣ�"+ cr.name);

			
		}
	}
	public void testForEachForSet(Student student){
		//��ӡ�����ѧ����ѡ�Ŀγ�,����Set ֻ����for each ��Iterator,������get(n)����Ϊ�������
				for(Course cr:student.courses){
					System.out.println("ѡ���˿γ�"+cr.name);
				}
	}
	
	/*
	 * ����list��contains����
	 */
	public void testListContains(){
		//��list��ȡ���γ̶���contains��������true
		Course course = coursesToSelect.get(0);
		//System.out.println("ȡ�ÿγ̣�"+course.name);
		//System.out.println(course.name+":"+coursesToSelect.contains(course));
		//������list����ȫһ���Ŀγ̶���contains����false����Ҫ��дCourse��equals����
		Course cr2 = new Course(course.id,course.name);
		System.out.println(cr2.name+"::"+coursesToSelect.contains(cr2));
		System.out.println("������γ����ƣ�");
		Course cr3 = new Course();
		String name = console.next();
		cr3.name= name;
		System.out.println("�½��γ̣�"+cr3.name);
		System.out.println("��ѡ�γ����Ƿ�����γ̣�"+cr3.name+coursesToSelect.contains(cr3));
		if(coursesToSelect.contains(cr3)){
			System.out.println("����λ��"+coursesToSelect.indexOf(cr3));//������ڶ����ͬ��Ԫ�أ��򷵻ص�һ��
		}
	}
	public void createStudentAndSelectCourse(){
		student = new Student("1", "С��");
		System.out.println("��ӭѧ��"+student.name+"ѡ��");
		//����һ��Scanner���������Ӽ��̽�������γ�id
		Scanner console = new Scanner(System.in);		
		for(int i=0;i<3;i++){
			System.out.println("����γ�ID");
			String courseId = console.next();
			for(Course cr:coursesToSelect){
				if(cr.id.equals(courseId)){
					
					//  Set�У����ĳ������������Ӷ��ٴΣ�����ֻ�ᱣ��һ��
					//  �ö��󣨵����ã������ң��������ǵ�һ����ӵ���һ��
					
					
					student.courses.add(cr);
				}
			}
		}
		
	}
	public void testSetContains(){				
		System.out.println("������γ����ƣ�");
		Course cr3 = new Course();
		String name = console.next();
		cr3.name= name;
		System.out.println("�½��γ̣�"+cr3.name);
		System.out.println("��ѡ�γ����Ƿ�����γ̣�"+cr3.name+student.courses.contains(cr3));
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
		Student student = new Student("1", "С��");
		System.out.println("��ӭѧ��"+student.name+"ѡ��");
		//����һ��Scanner���������Ӽ��̽�������γ�id
		Scanner console = new Scanner(System.in);
		
		for(int i=0;i<3;i++){
			System.out.println("����γ�ID");
			String courseId = console.next();
			for(Course cr:st.coursesToSelect){
				if(cr.id.equals(courseId)){
					
					//  Set�У����ĳ������������Ӷ��ٴΣ�����ֻ�ᱣ��һ��
					//  �ö��󣨵����ã������ң��������ǵ�һ����ӵ���һ��
					
					
					student.courses.add(cr);
				}
			}
		}
		st.testForEachForSet(student);
		*/
	}

}
