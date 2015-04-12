package com.imooc;

/*
 * 单例模式
 * 应用场合：有些对象只需要一个就足够了
 * 作用：保证整个应用程序某个实例有且只有一个
 * 类型：饿汉模式：类加载时比较慢，但运行时获取对象的速度比较快，线程安全的
 */
public class Singleton {
	//1、将构造方法私有化，不允许外部直接创建对象
	private Singleton(){
		
	}
	
	//2、创建类的唯一实例,有static，外部才不需要创建实例也可以获取得到instance
	//private 封装
	// static 定义的类成员，在类加载的时候自动执行
	private static Singleton instance = new Singleton();
	
	//提供一个获取实例的方法
	public static Singleton getInstance(){
		return instance;
	}
}
