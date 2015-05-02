package com.imooc.baseadapther;

import java.util.List;

import com.imooc.baseadapther.R;
import com.imooc.baseadapther.util.ViewHolder;
import com.imooc.baseadapther.util.comAdapther;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class comAdapthercomViewHolder extends comAdapther<itemBean>{
	private static final String TAG = "comAdapthercomViewHolder";	
	public comAdapthercomViewHolder(Context context, List<itemBean> mList) {
		super(context, mList,R.layout.list_item_layout);
		// TODO Auto-generated constructor stub
	}	

	@Override
	public void convert(ViewHolder holder, itemBean t) {
		// TODO Auto-generated method stub
		((TextView)holder.getView(R.id.title)).setText(t.getTitle());
		((TextView)holder.getView(R.id.time)).setText(t.getTime());
		((TextView)holder.getView(R.id.desc)).setText(t.getDesc());
		((TextView)holder.getView(R.id.phone)).setText(t.getPhone());
	}
	
	
	
}


