package com.imooc;

public class Initial {

	public Initial() {
		// TODO Auto-generated constructor stub
	}
	final int test=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal(3);
		System.out.println(animal.age);
		Dog dog = new Dog();		
		dog.eat();
		dog.method();
		System.out.println(dog);
		
		Dog dog2 = new Dog();
		
		if(dog.equals(dog2)){
			System.out.println("两个对象是相同的");
		}else{
			System.out.println("两个对象是不同的");
		}

	}

}
