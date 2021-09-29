package com.concordia.dsAndCollections;

import java.util.Iterator;

public class Arrays {

	public static void main(String[] args) {
		// Arrays
		int[] integerArray = { 2, 4, 5, 8 };
		String[] stringsArray = { "Canada", "USA", "Mexico" };
		java.util.Arrays.sort(integerArray);
		java.util.Arrays.sort(stringsArray);

		for (int i = 0; i < integerArray.length; i++) {
			System.out.println("Item #" + i + " is: " + integerArray[i]);
		}
		
		for (int i = 0; i < stringsArray.length; i++) {
			System.out.println("Item #" + i + " is: " + stringsArray[i]);
		}
	}

}
