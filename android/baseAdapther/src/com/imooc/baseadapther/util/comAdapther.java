package com.imooc.baseadapther.util;

import java.util.List;

import com.imooc.baseadapther.R;
import com.imooc.baseadapther.itemBean;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public abstract class comAdapther<T> extends BaseAdapter {
	protected LayoutInflater mflater;
	protected Context mContext;
	protected List<T> mList;
	protected int layoutId;
	public comAdapther(Context context,List<T> mList,int layoutid){
		// TODO Auto-generated constructor stub
		this.mContext = context;
		this.mflater = LayoutInflater.from(context);
		this.mList = mList;
		this.layoutId = layoutid;
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mList.size();
	}

	@Override
	public T getItem(int position) {
		// TODO Auto-generated method stub
		return mList.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}
	
	public View getView(int position, View convertView, ViewGroup parent){
		ViewHolder holder = ViewHolder.get(mContext,convertView,parent,layoutId,position);
		convert(holder,getItem(position));
		return holder.getConvertView();
	}	
	public abstract void convert(ViewHolder holder,T t);

}
