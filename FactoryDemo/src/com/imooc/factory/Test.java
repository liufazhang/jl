package com.imooc.factory;

public class Test {
	public static void main(String[] args) {
		//HairInterface left = new LeftHair();
		//left.draw();
		
		HairFactory factory = new HairFactory();
		HairInterface hair = factory.getHairByClassKey("in");
		hair.draw();
		//HairInterface hair = factory.getHairByclass("com.imooc.factory.LeftHair");//classÃûÌ«³¤£¬properties
		//hair.draw();
		//HairInterface left = factory.getHair("left");
		//left.draw();
		
//		PersonFactory facoty = new MCFctory();
//		Girl girl = facoty.getGirl();
//		girl.drawWomen();
		
		PersonFactory facoty = new HNFactory();
		Boy boy =  facoty.getBoy();
		boy.drawMan();
	}
}
