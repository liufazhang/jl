package com.imooc.baseadapther;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class commonAdapther extends BaseAdapter{
	private List<itemBean> mData;
	private LayoutInflater mflater;
	public commonAdapther(Context context,List<itemBean> mlist) {
		// TODO Auto-generated constructor stub
		mflater = LayoutInflater.from(context);
		mData = mlist;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mData.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return mData.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder holder = null;
		if(convertView == null){
			convertView = mflater.inflate(R.layout.list_item_layout,parent,false);
			holder = new ViewHolder();
			holder.mTime = (TextView) convertView.findViewById(R.id.time);
			holder.mTitle = (TextView) convertView.findViewById(R.id.title);
			holder.mDesc = (TextView) convertView.findViewById(R.id.desc);
			holder.mPhone = (TextView) convertView.findViewById(R.id.phone);
			convertView.setTag(holder);
		}else{
			holder = (ViewHolder) convertView.getTag();
		}
		itemBean bean = mData.get(position);
		holder.mTitle.setText(bean.getTitle());
		holder.mDesc.setText(bean.getDesc());
		holder.mPhone.setText(bean.getPhone());
		holder.mTime.setText(bean.getTime());
		return convertView;
	}
	
	private class ViewHolder{
		private TextView mTime;
		private TextView mTitle;
		private TextView mDesc;
		private TextView mPhone;
	}
}


