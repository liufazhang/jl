package com.imooc.test;

public class ChainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChainTest ct = new ChainTest();
		try{
			ct.test2();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void test1()throws DrunkException{
		throw new DrunkException("�����𿪳�");
	}
	public void test2(){
		try{
			test1();
		}catch(DrunkException e){
			//RuntimeException newExc =new RuntimeException("��ϧ��������ȫ��ʻ");
			//newExc.initCause(e);
			RuntimeException newExc =new RuntimeException(e);
			throw newExc;
		}
	}

}
