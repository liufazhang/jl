package com.imooc.reflect;

public class OfficeBetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//��̬�����࣬������ʱ�̼���
			Class c = Class.forName(args[0]);
			//ͨ�������ͣ������������
			try {
				/*
				 * ���Ҫ��Word Excel�����ã���Ҫͳһ�ӿ�,��������ֻ��Ҫͳһʵ�ֽӿ�
				 */
				//Word w = (Word)c.newInstance();
				//Excel e = (Excel)c.newInstance();
				OfficeAble oa = (OfficeAble)c.newInstance();
				oa.start();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
