package com.concordia.innerAndOuter;

public class OuterClass {
	private int price;
	private int tax;
	
	public void setupInnerClass() {
		new InnerClass().setupOuterClass();
	}
	
	class InnerClass{
		public void setupOuterClass() {
			price = 100;
			tax = 15;
			
			System.out.println("Inside inner class!\nPrice: " + price + "\nTax: " + tax);
		}
	}
}
