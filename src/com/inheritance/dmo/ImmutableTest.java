package com.inheritance.dmo;

public class ImmutableTest extends Exception {
	
	static{
		
		System.out.println("I am running Static Block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ImmutableClass imm = new ImmutableClass(1, "ABC");
		System.out.println(imm.getId());
		System.out.println(imm.getName());
		
		ImmutableClass imm1 = new ImmutableClass(2, "ABCD");
		System.out.println(imm1.getId());
		System.out.println(imm1.getName());
		
	}

}
