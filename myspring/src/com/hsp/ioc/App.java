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
		 * 上下文方式获取 bean，实例化beans.xml 时配置文件中所有配置为singleton(默认）的bean会被实例化，这种方式预先加载，速度快，耗内存
		 */
		//ApplicationContext ac = 
		//		new ClassPathXmlApplicationContext("com/hsp/ioc/beans.xml");
		
		/*
		 * 通过文件路径来获取
		 */
		ApplicationContext ac = new FileSystemXmlApplicationContext("D:\\software\\java\\myspring\\src\\com\\hsp\\ioc\\beans.xml");
		Student st1 = (Student)ac.getBean("student");
		Student st2 = (Student)ac.getBean("student");
		System.out.println(st1+""+st2); //singleton(默认）
		/*
		 * BeanFactory方式，只有在getBean时才会实例化，这种方式相当于延时加载，节约内存
		 */
		BeanFactory BF = new XmlBeanFactory(new ClassPathResource("com/hsp/ioc/beans.xml"));
		Student st = (Student)BF.getBean("student");
		
		
	}

}
