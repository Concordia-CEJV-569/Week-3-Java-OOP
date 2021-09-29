package com.concordia.dsAndCollections;

public class StaticDemo {

	private static String name;

	public static void main(String[] args) {
		int firstInt = -12;
		int secondInt = 18;

		System.out.println("Min: " + Math.min(firstInt, secondInt));
		System.out.println("Abs: " + Math.abs(firstInt));
		
		System.out.println(name);
		
//		System.out.println(StaticDemo.set);
	}

	public void setName(String name) {
//		this.name = name;
		StaticDemo.name = name;
	}
}
