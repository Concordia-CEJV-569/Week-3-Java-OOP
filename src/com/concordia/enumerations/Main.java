package com.concordia.enumerations;

public class Main {
	public enum Members {
		MELI, JACOB, DANIEL
	}

	public static Members selectedPerson;

//	public static final int MELI = 1;
//	public static final int JACOB = 2;
//	public static final int DANIEL = 3;

	public static void main(String[] args) {
		selectedPerson = Members.JACOB;
		
		if (selectedPerson.equals(Members.MELI)) {
			System.out.println("Meli");
		}
		
		if (selectedPerson.equals(Members.JACOB)) {
			System.out.println("Jabob");
		}
		

//		int selectedPerson = 1;
//
//		if (selectedPerson == MELI) {
//			System.out.println("Meli!!");
//		}

	}

}
