package com.imooc;

public class SmartPhone extends Telephone  implements IPlayGame {

	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("语音打电话");
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("可以发送语音信息");
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("具有游戏功能");
		
	}

}
