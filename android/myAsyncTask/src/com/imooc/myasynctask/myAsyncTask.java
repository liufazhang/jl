package com.imooc.myasynctask;

import android.os.AsyncTask;
import android.util.Log;

public class myAsyncTask extends AsyncTask<Void, Void, Void> {
	private static final String TAG = "myAsyncTask";
	@Override
	protected Void doInBackground(Void... params) {
		// TODO Auto-generated method stub
		Log.d(TAG,"doInBackground");
		publishProgress();
		return null;
	}
	
	@Override
	protected void onPostExecute(Void result) {
		// TODO Auto-generated method stub
		Log.d(TAG,"onPostExecute");
		super.onPostExecute(result);
	}
	
	@Override
	protected void onPreExecute() {
		// TODO Auto-generated method stub
		Log.d(TAG,"onPreExecute");
		super.onPreExecute();
	}
	
	@Override
	protected void onProgressUpdate(Void... values) {
		// TODO Auto-generated method stub
		Log.d(TAG,"onProgressUpdate");
		super.onProgressUpdate(values);
	}
	

}
