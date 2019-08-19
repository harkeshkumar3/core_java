package com.core.demo;

class First {

	void display() {
		System.out.println("Inside First");
	}
}

class Second extends First {

	void display() {
		System.out.println("Inside Second");
	}
}

public class JavaClassandObjectQuestion5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		First obj1 = new First();
		Second obj2 = new Second();

		First ref;
		ref = obj1;
		ref.display();

		ref = obj2;
		ref.display();

	}

}
