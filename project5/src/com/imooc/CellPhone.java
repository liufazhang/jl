package com.imooc;

public class CellPhone extends Telephone {

	public CellPhone() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("实体按键打电话");

	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("实体按键发信息");
	}

}
