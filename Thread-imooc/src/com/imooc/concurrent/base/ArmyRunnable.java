package com.imooc.concurrent.base;

public class ArmyRunnable implements Runnable {
	volatile boolean keepRunning = true;//保证了线程可以正确的读取其它线程写入的值
	//可见性 ref jmm happens-before原则
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(keepRunning){
			for(int i=0; i<5;i++){
				System.out.println(Thread.currentThread().getName()+"进攻对方["+i+"]");
				Thread.yield();//当前线程让出处理器时间，下次谁进攻还不一定呢
			}
		}
		System.out.println(Thread.currentThread().getName()+"进攻结束了");
	}

}
