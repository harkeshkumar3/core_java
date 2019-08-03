package com.collections.demo;

import java.util.HashMap;

public class HashMapKeyClassDemo {
	
	public static void main(String a[]) {
		HashMap<student, Boolean> map = new HashMap<student, Boolean>();
		student s = new student(2, 2);
		map.put(new student(1, 1), true);
		map.put(new student(1, 1), true); /// Wihout hascode and equal mathod  size 2  But with hascode size is 1
		map.put(s, false);
		map.put(s, false);
		map.put(s, false);
		
		
		System.out.println(map.size());
	}

}


class student{
	int a; int b;

	student(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		student other = (student) obj;
		if (a != other.a) {
			return false;
		}
		if (b != other.b) {
			return false;
		}
		return true;
	}
	
	
	
	
	
	
}