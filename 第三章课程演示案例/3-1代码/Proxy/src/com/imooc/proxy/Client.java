package com.imooc.proxy;

public class Client {

	/**
	 * ≤‚ ‘¿‡
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Moveable m = (Moveable)Proxy.newProxyInstance(Moveable.class);
		m.move();
	}

}
