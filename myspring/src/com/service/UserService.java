package com.service;

public class UserService {
	private String name;
	private	 ByeService mByeService;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void sayHello(){
		System.out.println("hello:"+name);
		mByeService.sayBye();
	}

	public ByeService getmByeService() {
		return mByeService;
	}

	public void setmByeService(ByeService mByeService) {
		this.mByeService = mByeService;
	}
	
	
}
