package com.dsp.inter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/dsp/inter/beans.xml");
		/*
		 * 
			��ʹ�ýӿ�
		UpperLetter changeLetter = (UpperLetter) ac.getBean("changeLetter");
		System.out.println(changeLetter.change());
		 */
		/*
		 * ʹ�ýӿ�
		 */
		ChangeLetter changeLetter = (ChangeLetter)ac.getBean("changeLetter");
		System.out.println(changeLetter.change());
	}
}
