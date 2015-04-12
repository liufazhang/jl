package com.imooc.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {
	/*
	 * ��ű�ѡ�γ̵�List
	 */
	public List coursesToSelect;
	
	public ListTest(){
		this.coursesToSelect = new ArrayList();
	}
	/*
	 * ������coursesToSelect����ӿγ�
	 */
	public void testAdd(){
		Course cr1 = new Course("1","���ݽṹ");
		coursesToSelect.add(cr1);
		Course tmp = (Course)coursesToSelect.get(0);//������뼯�϶����object���ͣ�ȡ��ʱ��ҪҪ����ת��		
		System.out.println(tmp.id + ":"+ tmp.name);
		
		Course cr2 = new Course("2","C ����");
		coursesToSelect.add(1,cr2);
		Course tmp2 = (Course)coursesToSelect.get(1);
		System.out.println(tmp2.id + ":"+ tmp2.name);
		
		Course[] course = {new Course("3","java"),new Course("4","PHP")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course tmp3 = (Course)coursesToSelect.get(2);
		Course tmp4 = (Course)coursesToSelect.get(3);
		System.out.println("��������ſγ�"+tmp3.id + ":"+ tmp3.name+" and "+tmp4.id + ":"+ tmp4.name);
		Course[] course2 = {new Course("5","html"),new Course("6","mysql")};
		coursesToSelect.addAll(2,Arrays.asList(course2));
		Course tmp5 = (Course)coursesToSelect.get(2);
		Course tmp6 = (Course)coursesToSelect.get(3);
		System.out.println("��������ſγ�"+tmp5.id + ":"+ tmp5.name+" and "+tmp6.id + ":"+ tmp6.name);
	}
	/*
	 * for ����List
	 */
	public void testGet(){
		int size = coursesToSelect.size();
		System.out.println("�����´�ѡ�γ�");
		for(int i = 0 ; i<size;i++){
			Course cr = (Course)coursesToSelect.get(i);
			System.out.println("�γ�id��"+ cr.id + " �γ����ƣ�"+ cr.name);
		}
	}
	
	/*
	 * ͨ������������List
	 * Iterator
	 */
	public void testIterator(){
		Iterator it = coursesToSelect.iterator();
		while(it.hasNext()){
			Course cr = (Course)it.next();
			System.out.println("�γ�id��"+ cr.id + " �γ����ƣ�"+ cr.name);

			
		}
	}
	
	/*
	 * ͨ��for each������������Ԫ��
	 */
	public void testForEach(){
		for(Object obj:coursesToSelect){
			Course cr = (Course)obj;
			System.out.println("�γ�id��"+ cr.id + " �γ����ƣ�"+ cr.name);

			
		}
	}
	/*
	 * �޸�List
	 */
	public void testModify(){
		coursesToSelect.set(4,new Course("5","python"));
	}
			
	public static void test(){
		System.out.println("test");
		
	}
	/*
	 * ɾ��List�е�Ԫ��
	 */
	public void testRemove(){
		Course cr = (Course)coursesToSelect.get(4);
		System.out.println("���ǿγ̣�"+cr.id+":"+cr.name);
		coursesToSelect.remove(cr);//Ҳ����ֱ��coursesToSelect.remove(4)
		System.out.println("ɾ���γ̳ɹ�");
		testForEach();
		
		Course[] course ={(Course)coursesToSelect.get(2),(Course)coursesToSelect.get(3)};
		coursesToSelect.removeAll(Arrays.asList(course));//Arrays.asList ������ת����List,removeall��List ɾ����������List�Ӽ�������Ԫ��
		testForEach();
		
	}
	/*
	 * ��List�����һЩ��Course����,����ʱ���׳��쳣����Ϊ����ʱ��ǿ��ת����Course
	 * ʹ�÷��ͣ�List��ֻ����ӷ�����ָ���Ķ������ͣ��粻���򣬱���������
	 */
	public void testType(){
		coursesToSelect.add("�Ҳ��ǿγ̣�ֻ���ַ���");
		
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
