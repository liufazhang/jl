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
		System.out.println("汽车开始行驶....");
		m.move();
		long endtime = System.currentTimeMillis();
		System.out.println("汽车结束行驶....  汽车行驶时间：" 
				+ (endtime - starttime) + "毫秒！");
	}
}