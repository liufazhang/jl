package com.imooc;

public class SmartPhone extends Telephone  implements IPlayGame {

	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("������绰");
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("���Է���������Ϣ");
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("������Ϸ����");
		
	}

}