package com.imooc.proxy;
public class $Proxy0 implements com.imooc.proxy.Moveable {
	public $Proxy0(com.imooc.proxy.Moveable m) {
		super();
		this.m = m;
	}
	private com.imooc.proxy.Moveable m;
	@Override
	public void move() {
		long starttime = System.currentTimeMillis();
		System.out.println("������ʼ��ʻ....");
		m.move();
		long endtime = System.currentTimeMillis();
		System.out.println("����������ʻ....  ������ʻʱ�䣺" 
				+ (endtime - starttime) + "���룡");
	}
}