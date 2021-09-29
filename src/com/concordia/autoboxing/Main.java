package com.concordia.autoboxing;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		int i = 32;

		// Autoboxing happens automatically
		ArrayList<Integer> arrayList = new ArrayList();
		arrayList.add(i);
		
		int myNumber = arrayList.get(0);
		
		
		
		int b = 23;
		// Physically wrapping my int primitive variable
		Integer integerObj = new Integer(b);
		// Unwrapping the Integer object
		int myInt = integerObj.intValue();
	}

}
