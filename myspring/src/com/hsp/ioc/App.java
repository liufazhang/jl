package com.hsp.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �����ķ�ʽ��ȡ bean��ʵ����beans.xml ʱ�����ļ�����������Ϊsingleton(Ĭ�ϣ���bean�ᱻʵ���������ַ�ʽԤ�ȼ��أ��ٶȿ죬���ڴ�
		 */
		//ApplicationContext ac = 
		//		new ClassPathXmlApplicationContext("com/hsp/ioc/beans.xml");
		
		/*
		 * ͨ���ļ�·������ȡ
		 */
		ApplicationContext ac = new FileSystemXmlApplicationContext("D:\\software\\java\\myspring\\src\\com\\hsp\\ioc\\beans.xml");
		Student st1 = (Student)ac.getBean("student");
		Student st2 = (Student)ac.getBean("student");
		System.out.println(st1+""+st2); //singleton(Ĭ�ϣ�
		/*
		 * BeanFactory��ʽ��ֻ����getBeanʱ�Ż�ʵ���������ַ�ʽ�൱����ʱ���أ���Լ�ڴ�
		 */
		BeanFactory BF = new XmlBeanFactory(new ClassPathResource("com/hsp/ioc/beans.xml"));
		Student st = (Student)BF.getBean("student");
		
		
	}

}
