package com.concordia.interfaces;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog();
		
		dog.setName("Joy");
		
		System.out.println(dog.getName());
		
		dog.beFriendly();
		dog.play();
	}

}
