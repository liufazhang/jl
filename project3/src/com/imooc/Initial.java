package com.imooc;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj1 = new Animal();
		Animal obj2 = new Dog();//��������ÿ���ָ������
		//Dog obj3 = new Animal();��
		obj1.eat();
		obj2.eat();
		Animal obj3 = new Cat();
		obj3.eat();
		
		Dog dog =new Dog();
		Animal animal = dog;//�Զ�������������������ת��
		Dog dog2 = (Dog)animal;//��������ת����ǿ������ת��
		if(animal instanceof Cat){
			Cat cat = (Cat)animal;//����ʱ Cat���� ������ʱDog����(animalָ��Dog�������ڴ��еĵ�ַ)
		}else{
			System.out.println("�޷���������ת��");
		}
		
	}

}