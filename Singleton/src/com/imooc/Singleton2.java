package com.imooc;

public class Singleton2 {
	
	/*
	 * ����ģʽ:����ʱ�ȽϿ죬������ʱ��ȡ������ٶȱȽ������̲߳���ȫ
	 */
	private Singleton2(){
		
	}
	//������������ʵ����
	private static Singleton2 instance;
	
	public static Singleton2 getInstance(){
		if(instance == null){
			instance = new Singleton2();
		}
		return instance;
	}
}
