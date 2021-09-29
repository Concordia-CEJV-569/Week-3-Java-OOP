package com.concordia.interfaces;

public class Dog extends Canine implements Pet {

	@Override
	public void beFriendly() {
		System.out.println("I'm friendly");
	}

	@Override
	public void play() {
		System.out.println("Let's play");
	}

}
