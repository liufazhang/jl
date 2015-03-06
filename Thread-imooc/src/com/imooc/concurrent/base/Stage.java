package com.imooc.concurrent.base;



/*
 * 隋唐演义大戏舞台
 */
public class Stage extends Thread {

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("欢迎观看隋唐演义");
		//让观众安静片刻，等待大戏上演
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("开始演出");
		ArmyRunnable armyTaskOfSuiDynasty = new ArmyRunnable();
		ArmyRunnable armyTaskOfRevolt = new ArmyRunnable();
		
		//
		Thread armyOfSuiDynasty = new Thread(armyTaskOfSuiDynasty,"隋军");
		Thread armyOfRevolt = new Thread(armyTaskOfRevolt,"农民起义军");
		armyOfRevolt.start();
		armyOfSuiDynasty.start();
		//舞台线程休眠，专心观看军队作战
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
		System.out.println("关键人物出场");
		Thread mrCheng = new KeyPersonThread();
		mrCheng.setName("程咬金");
		
		//军队停止作战
		armyTaskOfRevolt.keepRunning = false;
		armyTaskOfSuiDynasty.keepRunning = false;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mrCheng.start();
		//所有线程等待程先生完成历史使命
		
		try {
			mrCheng.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("谢谢观看隋唐演义，演出结束");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Stage().start();
		//Thread actressThread = new Thread(new Stage(),"Ms.Runnable");
	//	actressThread.start();

	}
}
