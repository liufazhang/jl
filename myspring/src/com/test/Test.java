package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.UserService;
import com.util.ApplicationContextUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ��ͳ��������UserService
		 */
		//UserService us = new UserService();
		//us.setName("��ͳ����");
		//us.sayHello();
		
		/*
		 * ʹ��spring
		 */
		//ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserService us = (UserService)ApplicationContextUtil.getApplicationContext().getBean("userService");
		us.sayHello();
	}

}
