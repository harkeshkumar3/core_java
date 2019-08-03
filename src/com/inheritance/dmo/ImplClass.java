package com.inheritance.dmo;

/**
 * Checked If two interface having some method in both interface
 * 
 * @author harkesh
 *
 */

public class ImplClass implements InterfaceA1, InterfaceA2 {

	public static void main(String args[]) {
		ImplClass cl = new ImplClass();
		/**
		 * Should throw a Complie time error because both will accept null as they are
		 * Wrapper class
		 */
		// cl.print(1, null);

		/***
		 * This time becuse 1 is integer so it will call print(int a, Integer b) Method
		 */
		cl.print(1, 1);
	}

	@Override
	public void print(int a, String b) {
		System.out.println(" String callig ");

	}

	@Override
	public void print(int a, Integer b) {
		// TODO Auto-generated method stub
		System.out.println("Int calling");

	}

}
