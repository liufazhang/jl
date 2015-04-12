package com.imooc.thread;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

class DemoRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("进入守护线程"+Thread.currentThread().getName());
		try {
			writeToFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("退出守护线程"+Thread.currentThread().getName());
		
	}
	private void writeToFile() throws Exception{
		File filename = new File("d:"+File.separator+"demo.txt");
		OutputStream os = new FileOutputStream(filename,true);
		int count = 0;
		while(count < 999){
			System.out.println("守护线程"+Thread.currentThread().getName()+
					"向文件中写入了word:"+count++);
			Thread.sleep(1000);
		}
	}

}

public class DemoThread{
	public static void main(String[] args) {
		System.out.println("进入主线程"+Thread.currentThread().getName());
		DemoRunnable dr = new DemoRunnable();
		Thread thread = new Thread(dr);
		thread.setDaemon(true);
		thread.start();
		Scanner sc = new Scanner(System.in);
		sc.next();
		System.out.println("退出主线程"+Thread.currentThread().getName());
	}
}
