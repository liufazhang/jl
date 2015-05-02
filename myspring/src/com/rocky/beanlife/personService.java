package com.rocky.beanlife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class personService implements BeanNameAware,BeanFactoryAware,ApplicationContextAware{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName called");
		this.name = name;
	}
	
	public void sayHi(){
		System.out.println("sayHi to "+ name);
	}

 	public personService(){
 
		System.out.println("构造函数");
	}
	
	public personService(String arg){
		System.out.println("sayHi to "+ arg);
	}
	
	//arg0　被调用的bean id
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("setBeaName"+arg0);
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("setBeanFactory" + arg0);
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("setApplicationContext"+arg0);
	}
	
}
