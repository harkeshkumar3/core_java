package com.core.demo;

class demo {
	int a, b;

	demo() {
		a = 10;
		b = 20;
	}

	public void print() {
		System.out.println("a = " + a + " b = " + b + "\n");
	}
}

public class JavaClassandObjectQuestion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		demo obj1 = new demo();
		demo obj2 = obj1;
		
		System.out.println("values of obj1 : ");
		obj1.print();

		obj1.a += 1;
		obj1.b += 1;

		System.out.println("values of obj1 : ");
		obj1.print();
		System.out.println("values of obj2 : ");
		obj2.print();

	}

}
