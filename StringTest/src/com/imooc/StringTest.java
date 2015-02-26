package com.imooc;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "imooc";
		String s2 = "imooc";
		String s3 = new String("imooc");
		String s4 = new String("imooc");
		System.out.println(s1==s2);//true
		System.out.println(s2==s3);//false
		System.out.println(s3==s4);//false
		System.out.println(s3.equals(s4));//true	
		System.out.println(s2.equals(s3));//true
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("please enter filename");
		String s = input.next();
		StringTest st = new StringTest();
		st.checkFileName(s);
		System.out.println("please enter email");
		String str= input.next();
		st.checkMailFormat(str);
		*/
		StringBuilder str1 = new StringBuilder("imooc");
		str1.append(",i love imooc");
		System.out.println(str1);
	}
	
	public void checkFileName(String s){
		
		int pos = s.lastIndexOf(".");
		if(pos!=0&&s.substring(pos+1,s.length()).equals("java")){
			System.out.println("Your input file is java file");
			
		}else{
			System.out.println("input file is not a java file");
		}
		
		
	}
	
	public void checkMailFormat(String s){
		int index1 =s.lastIndexOf("@");
		int index2 = s.lastIndexOf(".");
		if(index1!=-1&& index2>index1){
			System.out.println("email format correct");
		}else{
			System.out.println("eamil format incorrect");
		}
	}

}
