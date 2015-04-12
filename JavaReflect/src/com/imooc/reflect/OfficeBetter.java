package com.imooc.reflect;

public class OfficeBetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//动态加载类，在运行时刻加载
			Class c = Class.forName(args[0]);
			//通过类类型，创建该类对象
			try {
				/*
				 * 这里，要想Word Excel都可用，需要统一接口,后续升级只需要统一实现接口
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
