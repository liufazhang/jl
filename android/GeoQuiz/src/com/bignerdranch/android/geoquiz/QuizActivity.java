package com.bignerdranch.android.geoquiz;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends Activity {
	private String TAG = "QuizActivity";
	private Button mTrueButton;
	private Button mFalseButton;
	private Button mNextButton;	
	private ImageButton mLastButton;
	private TextView mQuestionTextView;
	private Button mCheatButton;
	private static final String KEY_INDEX="index";
	private static final String KEY_MISCHEATER = "mIsCheater";
	private TrueFalse[] mQuestionBank = new TrueFalse[]{
			new TrueFalse(R.string.question_asia,true),
			new TrueFalse(R.string.question_mideast,false),
			new TrueFalse(R.string.question_oceans,true),
			new TrueFalse(R.string.queston_africa,false),
	};
	private int mCurrentIndex = 0 ;
	private boolean mIsCheater;
	@TargetApi(11)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.HONEYCOMB){
        	 ActionBar actionBar = getActionBar();
             actionBar.setSubtitle("Bodies of Water");
        }
       
       if(savedInstanceState!=null){
    	   mCurrentIndex = savedInstanceState.getInt(KEY_INDEX,0);
    	   mIsCheater = savedInstanceState.getBoolean(KEY_MISCHEATER, false);
       }
       mTrueButton = (Button)findViewById(R.id.true_button);
       mFalseButton =(Button)findViewById(R.id.false_button);
       mQuestionTextView = (TextView)findViewById(R.id.question_text_view);
       mNextButton = (Button)findViewById(R.id.next_button);  
       mLastButton = (ImageButton)findViewById(R.id.back_button);
       mCheatButton = (Button)findViewById(R.id.cheat_button);
       mTrueButton.setOnClickListener(new View.OnClickListener() {
				@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
				//Toast.makeText(QuizActivity.this, R.string.correct_toast,Toast.LENGTH_LONG).show();
					checkAnswer(true);
		}
	});
       
       mFalseButton.setOnClickListener(new View.OnClickListener() {		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			//Toast.makeText(QuizActivity.this, R.string.incorrect_toast, Toast.LENGTH_SHORT).show();
			checkAnswer(false);
		}
	});
       
       mNextButton.setOnClickListener(new View.OnClickListener() {		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			mCurrentIndex = (mCurrentIndex+1)%mQuestionBank.length;	
			mIsCheater = false;
			updateQuestion();
		}
	});
       mLastButton.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			mIsCheater = false;
			if(mCurrentIndex==0){
				mCurrentIndex =mQuestionBank.length-1;
			}else{
				mCurrentIndex = (mCurrentIndex-1)%mQuestionBank.length;	
			}			
			updateQuestion();
		}
	});
       mQuestionTextView.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			mCurrentIndex = (mCurrentIndex+1)%mQuestionBank.length;	
			updateQuestion();
		}
	});
       mCheatButton.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent i = new Intent(QuizActivity.this,CheatActivity.class);
			boolean answerIsTrue = mQuestionBank[mCurrentIndex].isTrueQuestion();
			Log.d(TAG,"answerIsTrue:"+answerIsTrue);
			i.putExtra(CheatActivity.EXTRA_ANSWER_IS_TRUE, answerIsTrue);
			//startActivity(i);
			startActivityForResult(i, 1);
		}
	});
       updateQuestion();
    }
    
    
    private void updateQuestion(){
    	int question = mQuestionBank[mCurrentIndex].getQuestion();
    	Log.d(TAG,"question:"+question);
		mQuestionTextView.setText(question);//TextView.setText()参数可以是字符串，也可以是资源id
		
    }
    private void checkAnswer(boolean userPressedTrue){
    	Log.d(TAG,"checkAnswer:"+mCurrentIndex);
    	boolean answerIsTrue = mQuestionBank[mCurrentIndex].isTrueQuestion();
    	int messageResId = 0;
    	if(mIsCheater){
    		messageResId = R.string.judgment_toast;
    	}else if(userPressedTrue == answerIsTrue){
    		messageResId = R.string.correct_toast;
    	}else{
    		messageResId = R.string.incorrect_toast;
    	}
    	Toast.makeText(this,messageResId, Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    	// TODO Auto-generated method stub
    	super.onActivityResult(requestCode, resultCode, data);
    	Log.d(TAG,"requestCode:"+requestCode);
    	if(data==null){
    		return ;
    	}
    	mIsCheater = data.getBooleanExtra(CheatActivity.EXTRA_ANSWER_SHOW,false);
    	Log.d(TAG,"resultCode:"+resultCode+" mIsCheater+"+mIsCheater);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.quiz, menu);
        return true;
    }
    
    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
    	// TODO Auto-generated method stub
    	super.onSaveInstanceState(savedInstanceState);
    	Log.d(TAG,"onSaveInstanceState");
    	savedInstanceState.putInt(KEY_INDEX, mCurrentIndex);
    	savedInstanceState.putBoolean(KEY_MISCHEATER, mIsCheater);
    }
    
    @Override
    protected void onPause() {
    	// TODO Auto-generated method stub
    	super.onPause();
    	Log.d(TAG,"onPause--------");
    }
    
    @Override
    protected void onStop() {
    	// TODO Auto-generated method stub
    	super.onStop();
    	Log.d(TAG,"onStop--------");
    }
    
    @Override
    protected void onStart() {
    	// TODO Auto-generated method stub
    	super.onStart();
    	Log.d(TAG,"onStart--------");
    }
    
    @Override
    protected void onRestart() {
    	// TODO Auto-generated method stub
    	super.onRestart();
    	Log.d(TAG,"onRestart--------");
    }
    @Override
    protected void onDestroy() {
    	// TODO Auto-generated method stub
    	super.onDestroy();
    	Log.d(TAG,"onDestroy--------");
    }
    @Override
    protected void onResume() {
    	// TODO Auto-generated method stub
    	super.onResume();
    	Log.d(TAG,"onResume--------");
    }
    
}
