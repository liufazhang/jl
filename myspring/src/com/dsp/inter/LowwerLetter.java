package com.dsp.inter;

public class LowwerLetter implements ChangeLetter {
	private String str;
	@Override
	public String change() {
		// TODO Auto-generated method stub
		return str.toLowerCase();
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}

}
