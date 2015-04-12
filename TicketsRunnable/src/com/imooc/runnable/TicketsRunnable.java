package com.imooc.runnable;

class MyThread implements Runnable{
	private int ticketsCont = 5;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(ticketsCont>0){
			ticketsCont--;
			System.out.println(Thread.currentThread().getName()+"卖了1张票，剩余票数："+ticketsCont);
		}
	}
	
}

public class TicketsRunnable {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread th1 = new Thread(mt,"窗口1");
		Thread th2 = new Thread(mt,"窗口2");
		Thread th3 = new Thread(mt,"窗口3");
		th1.start();
		th2.start();
		th3.start();
	}
}
