package com.imooc.thread;

class MyThread extends Thread{
	private int ticketsCon = 5; 
	private String name;
	
	public MyThread(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while(ticketsCon > 0){
			ticketsCon--;
		System.out.println(name + "����1��Ʊ��ʣ��Ʊ����"+ ticketsCon);
		
		}
	}
	
}
public class TicketsThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt1 = new MyThread("����1");
		MyThread mt2 = new MyThread("����2");
		MyThread mt3 = new MyThread("����3");
		
		mt1.start();
		mt2.start();
		mt3.start();

	}

}
