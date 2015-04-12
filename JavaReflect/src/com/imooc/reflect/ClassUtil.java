package com.imooc.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassUtil {
	
	/*
	 * ��ӡ�����Ϣ��������ĳ�Ա��������Ա����
	 */
	public static void printClassMessage(Object obj){
		Class c = obj.getClass();//��ȡ������
		System.out.println(c.getName());//��ȡ�������
		
		/*
		 * Method�࣬�������� 
		 * һ����Ա��������һ�� Method����
		 * getMethods ��ȡpublic�����������Ӹ���̳е�
		 * getDeclaredMethods() ��ȡ���������ķ���
		 */
		Method mt[] = c.getMethods();		
		for(Method mts:mt){
			//��ȡ����ֵ�����͵�������
			Class ReturnType = mts.getReturnType();
			//��ȡ����ֵ��������
			System.out.println(ReturnType.getName()+"");
			System.out.print(mts.getName()+"(");//��ȡ������
			//��ȡ�������ͣ��õ����ǲ������͵�������
			Class paramType[] = mts.getParameterTypes();
			for(Class parm:paramType){
				System.out.print(parm.getName()+",");
			}
			
			System.out.print(")");
			
		}
		
		
	}

	public static void printFieldMessage(Object obj) {
		/*
		 * ��Ա����Ҳ�Ƕ���java.lang.reflect.Field
		 * Field���װ�˳�Ա�����Ĳ���
		 * getField������ȡ�������г�Ա��������Ϣ
		 * getDeclaredField��ȡ���Ǹ����Լ������ĳ�Ա������Ϣ
		 */
		Class c = obj.getClass();
		System.out.println("--------------��Ա����--------");
		Field fields[] = c.getFields();
		for(Field fd:fields){
			//�õ���Ա������������
			Class fieldType = fd.getType();
			String typeName = fieldType.getName();
			String fieldName = fd.getName();
			System.out.println(typeName + ":" + fieldName);
			
		}
	}
	
	/*
	 * ��ȡ���캯������Ϣ
	 * java.lang.reflect.Constructor
	 */
	public static void printConMessage(Object obj){
		Class c = obj.getClass();
		Constructor constructor[] = c.getDeclaredConstructors();
		for(Constructor ct:constructor){
			System.out.print(ct.getName()+"(");
			//���캯���Ĳ����б��������
			Class paramType[] = ct.getParameterTypes();
			for(Class param:paramType){
				System.out.print(param.getName()+",");
			}
			System.out.println(")");
		}
	}
	

}
