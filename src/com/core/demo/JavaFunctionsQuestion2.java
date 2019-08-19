package com.core.demo;

public class JavaFunctionsQuestion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = null;
		giveMeString(x);
		System.out.println(x);

	}

	private static void giveMeString(String x) {
		// TODO Auto-generated method stub

		x = "NewUpdated";
	}

	// Explanation: Parameters in Java is passed by value. So the changes made to y
	// do not reflect in main().

}
