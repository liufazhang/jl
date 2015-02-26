package com.imooc;

public class Dog extends Animal {
	public int age=20;
	public Dog() {
		// TODO Auto-generated constructor stub
		super(3);
		System.out.println("dog");
	
	}
	public void eat(){
		System.out.println("dog can eat");
	}
	
	public void method(){
		//System.out.println(super.age);
		super.eat();
	}
	@Override
	public String toString() {
		return "Dog [age=" + age + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		return true;
	}
	
}
