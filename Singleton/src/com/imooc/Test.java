package com.imooc;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if(s1==s2){
			System.out.println("s1/s2是同一个实例");
		}
		
		//
		Singleton2 s3 = Singleton2.getInstance();
		Singleton2 s4 = Singleton2.getInstance();
		if(s3==s4){
			System.out.println("s3/s4是同一个实例");
		}
	}
	
}
