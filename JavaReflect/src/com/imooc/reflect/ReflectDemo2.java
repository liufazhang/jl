package com.imooc.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("hello");
		//list1.add(20);错误 
		Class c1 = list.getClass();
		Class c2 = list1.getClass();
		System.out.println(c1==c2);
		/*
		 * 反射的操作都是编译之后的操作，运行时
		 * c1==c2返回true，说明编译之后集合的泛型是去泛型化的
		 * java中的集合泛型，是防止错误输入的，只在编译阶段有效，绕过编译就无效了
		 * 验证：通过方法的反射来操作，绕过编译
		 */
		try {
			Method m = c2.getMethod("add",Object.class);
			m.invoke(list1,20);
			System.out.println(list1);
			/*
			 * 不能用foreach遍历了，有int类型
			
			for(String str:list1){
				System.out.println(str);
			}
			
			 */
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
	}

}
