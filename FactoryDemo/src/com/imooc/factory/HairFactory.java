package com.imooc.factory;

import java.util.Map;

/*
 * ���͹���
 */
public class HairFactory {
	public HairInterface getHair(String key){
		if("left".equals(key)){
			return new LeftHair();
		}else if("right".equals(key)){
			return new RightHair();
		}
		return null;
	}
	
	/*
	 * �������������ɶ���
	 */
	public HairInterface getHairByclass(String classname){
		
		try {
			HairInterface hair  = (HairInterface) Class.forName(classname).newInstance();
			return hair;
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
public HairInterface getHairByClassKey(String classname){
		
		try {
			Map<String,String> map = new PropertiesReader().getProperties();
			
			HairInterface hair  = (HairInterface) Class.forName(map.get(classname)).newInstance();
			return hair;
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
