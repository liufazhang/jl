package com.imooc.concurrent.base;

public class ArmyRunnable implements Runnable {
	volatile boolean keepRunning = true;//��֤���߳̿�����ȷ�Ķ�ȡ�����߳�д���ֵ
	//�ɼ��� ref jmm happens-beforeԭ��
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(keepRunning){
			for(int i=0; i<5;i++){
				System.out.println(Thread.currentThread().getName()+"�����Է�["+i+"]");
				Thread.yield();//��ǰ�߳��ó�������ʱ�䣬�´�˭��������һ����
			}
		}
		System.out.println(Thread.currentThread().getName()+"����������");
	}

}
