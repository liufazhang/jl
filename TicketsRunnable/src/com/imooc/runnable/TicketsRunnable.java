package com.imooc.runnable;

class MyThread implements Runnable{
	private int ticketsCont = 5;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(ticketsCont>0){
			ticketsCont--;
			System.out.println(Thread.currentThread().getName()+"����1��Ʊ��ʣ��Ʊ����"+ticketsCont);
		}
	}
	
}

public class TicketsRunnable {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread th1 = new Thread(mt,"����1");
		Thread th2 = new Thread(mt,"����2");
		Thread th3 = new Thread(mt,"����3");
		th1.start();
		th2.start();
		th3.start();
	}
}
