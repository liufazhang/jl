package com.imooc.reflect;

import java.lang.reflect.Method;

public class ReflectDemo1 {
	public static void main(String[] args) {
		/*
		 * 获取print方法：
		 * 1、首先要获取类的信息,获取类的信息首先要获取类的类类型
		 * 2、获取方法，要有名称和参数列表
		 */
		A a1 = new A();
		Class c = a1.getClass();
		try {
			//方法的反射操作  
	    	//a1.print(10, 20);方法的反射操作是用m对象来进行方法调用 和a1.print调用的效果完全相同
	        //方法如果没有返回值返回null,有返回值返回具体的返回值
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
