package com.bignerdranch.android.criminalIntent;

import java.text.Format;
import java.util.Date;
import java.util.UUID;

import android.text.format.DateFormat;

public class Crime {
	private UUID mId;
	private String mTitle;
	private Date mDate;
	private boolean mSolved;
	public Crime(){
		mId = UUID.randomUUID();
		mDate = new Date();
		//DateFormat a
		
	}
	public String getDateFormat(String inFormat){
		String mDateFormat = (String)DateFormat.format(inFormat, mDate);
		return mDateFormat;
	}
	public String getTitle() {
		return mTitle;
	}
	public void setTitle(String title) {
		mTitle = title;
	}
	public UUID getId() {
		return mId;
	}
	public Date getDate() {
		return mDate;
	}
	public void setDate(Date date) {
		mDate = date;
	}
	public boolean isSolved() {
		return mSolved;
	}
	public void setSolved(boolean solved) {
		mSolved = solved;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return mTitle;
	}
	
}
