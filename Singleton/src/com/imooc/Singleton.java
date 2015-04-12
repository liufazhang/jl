package com.imooc;

/*
 * ����ģʽ
 * Ӧ�ó��ϣ���Щ����ֻ��Ҫһ�����㹻��
 * ���ã���֤����Ӧ�ó���ĳ��ʵ������ֻ��һ��
 * ���ͣ�����ģʽ�������ʱ�Ƚ�����������ʱ��ȡ������ٶȱȽϿ죬�̰߳�ȫ��
 */
public class Singleton {
	//1�������췽��˽�л����������ⲿֱ�Ӵ�������
	private Singleton(){
		
	}
	
	//2���������Ψһʵ��,��static���ⲿ�Ų���Ҫ����ʵ��Ҳ���Ի�ȡ�õ�instance
	//private ��װ
	// static ��������Ա��������ص�ʱ���Զ�ִ��
	private static Singleton instance = new Singleton();
	
	//�ṩһ����ȡʵ���ķ���
	public static Singleton getInstance(){
		return instance;
	}
}
