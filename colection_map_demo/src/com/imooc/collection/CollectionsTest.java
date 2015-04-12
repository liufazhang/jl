package com.imooc.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsTest {
	/*
	 * ��Ҫ��ɣ�
	 * 1��ͨ��Collections.sort()��������Integer���͵�List��������
	 * 2����String���͵�List��������
	 * 3�����������ͷ��͵�List����������StudentΪ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionsTest ct = new CollectionsTest();
		//ct.testSort1();
		//ct.testSortString();
		ct.testSort3();
	}
	
	/*
	 *  1��ͨ��Collections.sort()��������Integer���͵�List��������
	 *  ����һ��Integer���͵�List������100���ڵĲ��ظ������
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
			System.out.println("�ɹ����������"+k);
		}
		System.out.println("-------------����ǰ-------");
		for(Integer it:integerList){
			System.out.println("Ԫ�أ�"+it);
		}
		
		Collections.sort(integerList);
		System.out.println("-------------�����-------");
		for(Integer it:integerList){
			System.out.println("Ԫ�أ�"+it);
		}
	}
	//2����String���͵�List��������
	public void testSortString(){
		List<String> stringList = new ArrayList<String>();
		stringList.add("micosoft");
		stringList.add("google");
		stringList.add("lenovo");
		System.out.println("-------------����ǰ-------");
		for(String st:stringList){
			System.out.println("Ԫ�أ�"+st);
		}
		System.out.println("-------------�����-------");
		Collections.sort(stringList);
		for(String st:stringList){
			System.out.println("Ԫ�أ�"+st);
		}
	}
	
	public void testSort3(){
		List<Student> stList = new ArrayList<Student>();
		Random random = new Random();
		
		stList.add(new Student(random.nextInt(1000)+"","mike"));
		stList.add(new Student(random.nextInt(1000)+"","rocky"));
		stList.add(new Student(random.nextInt(1000)+"","angela"));
		stList.add(new Student(10000+"","json"));
		System.out.println("-------------����ǰ-------");
		for(Student st:stList){
			System.out.println("ѧ����"+st.id+":"+st.name);
		}
		//Collections.sort(stList);�������Collections.sort�Ĳ����������ʵ��Comparable�ӿڣ�����ҪStudentʵ��Comparable�ӿ�
		Collections.sort(stList);
		System.out.println("------------id-�����-------");
		for(Student st:stList){
			System.out.println("ѧ����"+st.id+":"+st.name);
		}
		System.out.println("-------------�������������-------");
		Collections.sort(stList,new StudentComparator());
		for(Student st:stList){
			System.out.println("ѧ����"+st.id+":"+st.name);
		}
	}
	/**

	 * ��ϰ��

	 * ����Collections.sort()�����Է���ΪString��List��������

	 * 1.������List<String> ֮�����������ʮ������ַ���

	 * 2.ÿ���ַ����ĳ���Ϊ10���ڵ��������

	 * 3.ÿ���ַ�����ÿ���ַ�Ϊ������ɵ��ַ����ַ������ظ�

	 * 4.ÿ������ַ����������ظ�
	 * */

}
