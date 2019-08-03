package com.inheritance.dmo;

public class PerentChildDemo extends ParentClass {
	
	ParentClass display(int i) {
		System.out.println("Child");
		return null;
	}

	
	/*
	 * public PerentChildDemo() { // TODO Auto-generated method stub
	 * System.out.println("Child"); }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParentClass p = new PerentChildDemo();
		//p.printIt(2);
	}

}


class ParentClass {
	
	/*
	 * public ParentClass() { System.out.println("Parent"); }
	 */
	
	PerentChildDemo display(int i) {
		System.out.println("Prenst");
		return null;
	}
	
	
}