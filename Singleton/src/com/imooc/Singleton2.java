package com.imooc;

public class Singleton2 {
	
	/*
	 * 懒汉模式:加载时比较快，但运行时获取对象的速度比较慢，线程不安全
	 */
	private Singleton2(){
		
	}
	//仅仅声明，不实例化
	private static Singleton2 instance;
	
	public static Singleton2 getInstance(){
		if(instance == null){
			instance = new Singleton2();
		}
		return instance;
	}
}
