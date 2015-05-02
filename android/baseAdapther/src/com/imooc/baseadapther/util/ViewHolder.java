package com.imooc.baseadapther.util;

import android.content.Context;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class ViewHolder {
	
	private static final String TAG = "ViewHolder";
	private int mPosition;
	private View mConvertView;
	private SparseArray<View> mViews;
	public ViewHolder(Context context,ViewGroup parent,int layoutid,int position) {
		// TODO Auto-generated constructor stub
		this.mPosition = position;
		this.mViews = new SparseArray<View>();
		mConvertView = LayoutInflater.from(context).inflate(layoutid, parent,false);
		mConvertView.setTag(this);
	}
	
	public static ViewHolder get(Context context,View convertView,ViewGroup parent,int layoutid,int position){
		if(convertView == null){
			return new ViewHolder(context, parent, layoutid, position);
		}else{
			ViewHolder holder = (ViewHolder)convertView.getTag();
			return holder;
		}
	
	}

	public View getConvertView() {
		return mConvertView;
	}
	
	public <T extends View> T getView(int viewId){
		View view = mViews.get(viewId);
		//Log.d(TAG,""+view);
		if(view == null){
			view = mConvertView.findViewById(viewId);
			mViews.put(viewId, view);
		}
		return (T)view;
	}
}
