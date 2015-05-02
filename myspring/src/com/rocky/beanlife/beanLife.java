package com.rocky.beanlife;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanLife {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/rocky/beanlife/beans.xml");
		personService ps = (personService)ac.getBean("personService");
		ps.sayHi();
	}
}
