package com.imooc.concurrent.base;



/*
 * ���������Ϸ��̨
 */
public class Stage extends Thread {

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("��ӭ�ۿ���������");
		//�ù��ڰ���Ƭ�̣��ȴ���Ϸ����
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("��ʼ�ݳ�");
		ArmyRunnable armyTaskOfSuiDynasty = new ArmyRunnable();
		ArmyRunnable armyTaskOfRevolt = new ArmyRunnable();
		
		//
		Thread armyOfSuiDynasty = new Thread(armyTaskOfSuiDynasty,"���");
		Thread armyOfRevolt = new Thread(armyTaskOfRevolt,"ũ�������");
		armyOfRevolt.start();
		armyOfSuiDynasty.start();
		//��̨�߳����ߣ�ר�Ĺۿ�������ս
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		armyTaskOfSuiDynasty.keepRunning = false;
		armyTaskOfRevolt.keepRunning = false;
		try {
			armyOfSuiDynasty.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�ؼ��������");
		Thread mrCheng = new KeyPersonThread();
		mrCheng.setName("��ҧ��");
		
		//����ֹͣ��ս
		armyTaskOfRevolt.keepRunning = false;
		armyTaskOfSuiDynasty.keepRunning = false;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mrCheng.start();
		//�����̵߳ȴ������������ʷʹ��
		
		try {
			mrCheng.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("лл�ۿ��������壬�ݳ�����");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Stage().start();
		//Thread actressThread = new Thread(new Stage(),"Ms.Runnable");
	//	actressThread.start();

	}
}
