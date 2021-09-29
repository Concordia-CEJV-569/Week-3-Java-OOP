package com.concordia.interfaces;

public class Animal {
	public String name;
	
	public void makeSound() {
		System.out.println("grrr");
	}
	
	public void makeSound(String sound) {
		System.out.println(sound);	
	}
	
	public void makeSound(String sound, String loundness) {
		System.out.println(sound + ", loudness: " + loundness);	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
