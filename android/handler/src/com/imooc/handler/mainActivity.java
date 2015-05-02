package com.imooc.handler;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class mainActivity extends Activity {
	private TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		tv = (TextView)findViewById(R.id.textView1);
		tv.setText("ON CREATE");
		
		new Thread(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				tv.setText("ThreadÖÐ¸üÐÂUI");
			}
		}.start();
	}
}
