package com.imooc.myasynctask;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class imageTest extends Activity {
	private ImageView mImageView;
	private ProgressBar mPg;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.image_test);
		mImageView = (ImageView)findViewById(R.id.imageView1);
		mPg = (ProgressBar)findViewById(R.id.pg);
	}
}
