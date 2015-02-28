package com.imooc.concurrent;

public class Actor extends Thread {

	public void run(){
		System.out.println(getName()+"��һ����Ա");
		int count = 0;
		boolean keepRuning = true;
		while(keepRuning){
			System.out.println(getName()+"��̨�ݳ���"+(++count));
			if(count == 50){
				keepRuning = false;
			}
			
			if(count%10 == 0){
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		System.out.println(getName()+"�ݳ�������");
		
	}
	public static void main(String[] args) {
		Thread actor = new Actor();
		actor.setName("Mr.Thread");
		actor.start();
		
		Thread actressThread = new Thread(new Actress(),"Ms.Runnable");
		actressThread.start();
	}
}

class Actress implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"��һ����Ա");
		int count = 0;
		boolean keepRuning = true;
		while(keepRuning){
			System.out.println(Thread.currentThread().getName()+"��̨�ݳ���"+(++count));
			if(count == 50){
				keepRuning = false;
			}
			
			if(count%10 == 0){
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		System.out.println(Thread.currentThread().getName()+"�ݳ�������");
	}
	
}