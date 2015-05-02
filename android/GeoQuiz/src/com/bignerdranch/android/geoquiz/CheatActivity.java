package com.bignerdranch.android.geoquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CheatActivity extends Activity {
	private static final String TAG="QuizActivity";
	public static final String EXTRA_ANSWER_IS_TRUE="com.bignerdranch.android.geoquiz.answer_is_true";
	public static final String EXTRA_ANSWER_SHOW="com.bignerdranch.android.geoquiz.answer_show";
	private static final String SHOW_ANSWER_KEY="showkey";
	private boolean mAnswerIsTrue;
	private TextView mAnswerTextView;
	private Button mShowAnswer;
	private boolean mHadShowAnswer = false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cheat);
		mAnswerIsTrue = getIntent().getBooleanExtra(EXTRA_ANSWER_IS_TRUE,false);
		Log.d(TAG,""+"CheatActivity GET mAnswerIsTrue:"+mAnswerIsTrue);
		mAnswerTextView = (TextView)findViewById(R.id.answerTextView);
		mShowAnswer = (Button)findViewById(R.id.showAnswerButton);
		if(savedInstanceState!=null){
			mHadShowAnswer = savedInstanceState.getBoolean(SHOW_ANSWER_KEY,false);
		}
		setAnswerShowResult(mHadShowAnswer);
		mShowAnswer.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(mAnswerIsTrue){
					mAnswerTextView.setText(R.string.true_button);
				}else{
					mAnswerTextView.setText(R.string.false_button);
				}
				setAnswerShowResult(true);
			}
		});
	}
	
		private void setAnswerShowResult(boolean isAnswerShow){
			Intent data = new Intent();
			data.putExtra(EXTRA_ANSWER_SHOW, isAnswerShow);
			setResult(RESULT_OK, data);
		}
		
		@Override
		protected void onSaveInstanceState(Bundle outState) {
			// TODO Auto-generated method stub
			super.onSaveInstanceState(outState);
			outState.putString(SHOW_ANSWER_KEY, EXTRA_ANSWER_SHOW);
		}
	  @Override
	    protected void onPause() {
	    	// TODO Auto-generated method stub
	    	super.onPause();
	    	Log.d(TAG,"onPause1--------");
	    }
	    
	    @Override
	    protected void onStop() {
	    	// TODO Auto-generated method stub
	    	super.onStop();
	    	Log.d(TAG,"onStop1--------");
	    }
	    
	    @Override
	    protected void onStart() {
	    	// TODO Auto-generated method stub
	    	super.onStart();
	    	Log.d(TAG,"onStart1--------");
	    }
	    
	    @Override
	    protected void onRestart() {
	    	// TODO Auto-generated method stub
	    	super.onRestart();
	    	Log.d(TAG,"onRestart1--------");
	    }
	    @Override
	    protected void onDestroy() {
	    	// TODO Auto-generated method stub
	    	super.onDestroy();
	    	Log.d(TAG,"onDestroy1--------");
	    }
	    @Override
	    protected void onResume() {
	    	// TODO Auto-generated method stub
	    	super.onResume();
	    	Log.d(TAG,"onResume1--------");
	    }
	
}
