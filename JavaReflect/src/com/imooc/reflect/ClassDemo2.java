package com.imooc.reflect;

public class ClassDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c1 = int.class;//int���������
		Class c2 = String.class;//String���������
		Class c3 = double.class;
		Class c4 = Double.class;
		Class c5 = Void.class;
		
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c3.getName());
		System.out.println(c4.getName());
		System.out.println(c5.getName());//ȫ·������
		System.out.println(c5.getSimpleName());//ֻ��ӡ����
	}

}
