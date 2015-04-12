package com.imooc.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassUtil {
	
	/*
	 * 打印类的信息，包括类的成员函数、成员变量
	 */
	public static void printClassMessage(Object obj){
		Class c = obj.getClass();//获取类类型
		System.out.println(c.getName());//获取类的名称
		
		/*
		 * Method类，方法对象 
		 * 一个成员方法就是一个 Method对象
		 * getMethods 获取public方法，包括从父类继承的
		 * getDeclaredMethods() 获取本类声明的方法
		 */
		Method mt[] = c.getMethods();		
		for(Method mts:mt){
			//获取返回值顾类型的类类型
			Class ReturnType = mts.getReturnType();
			//获取返回值的类型名
			System.out.println(ReturnType.getName()+"");
			System.out.print(mts.getName()+"(");//获取方法名
			//获取参数类型，得到的是参数类型的类类型
			Class paramType[] = mts.getParameterTypes();
			for(Class parm:paramType){
				System.out.print(parm.getName()+",");
			}
			
			System.out.print(")");
			
		}
		
		
	}

	public static void printFieldMessage(Object obj) {
		/*
		 * 成员变量也是对象，java.lang.reflect.Field
		 * Field类封装了成员变量的操作
		 * getField方法获取的是所有成员变量的信息
		 * getDeclaredField获取的是该类自己声明的成员变量信息
		 */
		Class c = obj.getClass();
		System.out.println("--------------成员变量--------");
		Field fields[] = c.getFields();
		for(Field fd:fields){
			//得到成员变量的类类型
			Class fieldType = fd.getType();
			String typeName = fieldType.getName();
			String fieldName = fd.getName();
			System.out.println(typeName + ":" + fieldName);
			
		}
	}
	
	/*
	 * 获取构造函数的信息
	 * java.lang.reflect.Constructor
	 */
	public static void printConMessage(Object obj){
		Class c = obj.getClass();
		Constructor constructor[] = c.getDeclaredConstructors();
		for(Constructor ct:constructor){
			System.out.print(ct.getName()+"(");
			//构造函数的参数列表的类类型
			Class paramType[] = ct.getParameterTypes();
			for(Class param:paramType){
				System.out.print(param.getName()+",");
			}
			System.out.println(")");
		}
	}
	

}
