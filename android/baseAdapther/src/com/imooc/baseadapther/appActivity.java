package com.imooc.baseadapther;

import java.util.ArrayList;
import java.util.List;

import com.imooc.baseadapther.util.ViewHolder;
import com.imooc.baseadapther.util.comAdapther;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class appActivity extends Activity {
	private ListView mListView;
	private List<itemBean> mList;
	private commonAdapther mAdapther;
	private comAdapthercomViewHolder mAdapther1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_adapther);
        initDatas();
        initView();
       
        
    }
	private void initDatas() {
		mList = new ArrayList<itemBean>();
		itemBean bean = new itemBean("日记1","广州恒大淘宝VS上海申花","10086","2015-04-26");
		mList.add(bean);
		bean = new itemBean("日记2","广州恒大淘宝VS江苏国信舜天","10086","2015-04-26");
		mList.add(bean);
		bean = new itemBean("日记3","广州恒大淘宝VS江苏国信舜天","10086","2015-04-26");
		mList.add(bean);
		bean = new itemBean("日记4","广州恒大淘宝VS江苏国信舜天","10011","2015-04-26");
		mList.add(bean);
		bean = new itemBean("日记4","广州恒大淘宝VS江苏国信舜天","10010","2015-05-02");
		mList.add(bean);
		//mAdapther = new commonAdapther(this, mList);
		//mAdapther1 = new comAdapthercomViewHolder(this, mList);
	}
	private void initView() {
		mListView = (ListView) findViewById(R.id.listView1);
		//mListView.setAdapter(mAdapther1);
		mListView.setAdapter(new comAdapther<itemBean>(this, mList,R.layout.list_item_layout) {

			@Override
			public void convert(ViewHolder holder, itemBean t) {
				// TODO Auto-generated method stub
				((TextView)holder.getView(R.id.title)).setText(t.getTitle());
				((TextView)holder.getView(R.id.time)).setText(t.getTime());
				((TextView)holder.getView(R.id.desc)).setText(t.getDesc());
				((TextView)holder.getView(R.id.phone)).setText(t.getPhone());
			}
		});
	}


  
    
}
