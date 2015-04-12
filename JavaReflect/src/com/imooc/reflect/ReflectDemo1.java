package com.imooc.reflect;

import java.lang.reflect.Method;

public class ReflectDemo1 {
	public static void main(String[] args) {
		/*
		 * ��ȡprint������
		 * 1������Ҫ��ȡ�����Ϣ,��ȡ�����Ϣ����Ҫ��ȡ���������
		 * 2����ȡ������Ҫ�����ƺͲ����б�
		 */
		A a1 = new A();
		Class c = a1.getClass();
		try {
			//�����ķ������  
	    	//a1.print(10, 20);�����ķ����������m���������з������� ��a1.print���õ�Ч����ȫ��ͬ
	        //�������û�з���ֵ����null,�з���ֵ���ؾ���ķ���ֵ
			//Method m = c.getMethod("print",int.class,int.class);
			//Object o = m.invoke(a1,10,10);
			Method m = c.getMethod("print",new Class[]{int.class,int.class});
			Object o = m.invoke(a1, new Object[]{20,10});
			
			//Method m1 = c.getDeclaredMethod("print",String.class,String.class);
			//Object o1 = m1.invoke(a1,new Object[]{"first:","second"});
			Method m1 = c.getMethod("print", new Class[]{String.class,String.class});
			Object o1 = m1.invoke(a1,"first","second");
			
			Method m2 = c.getMethod("print");
			Object o2 = m2.invoke(a1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

class A{
	public void print(int a,int b){
		System.out.println(a+b);
	}
	
	public void print(String a,String b){
		System.out.println(a.toUpperCase()+","+b.toLowerCase());
		
	}
	
	public void print(){
		System.out.println("ssssssssssss");
	}
}
