package com.imooc.reflect;

public class Office {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if("Word".equals(args[0])){
			Word w = new Word(); 
			
		}
		if("Excel".equals(args[0])){
			/*
			 * new 方法创建的类为静态加载类：编译时加载所有的，可能使用到的类，即使不用也要加载。100个类，
			 * 一个有错，全部报废：也浪费时间
			 * 通过动态加载类可以解决该问题
			 */
			//Excel e = new Excel();
		}
	}

}
