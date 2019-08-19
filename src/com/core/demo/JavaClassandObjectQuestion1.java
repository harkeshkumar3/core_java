package com.core.demo;

class Test1 {
	int i;
}

public class JavaClassandObjectQuestion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test1 t; // = new Test1();
		System.out.println(t.i);
		// t is just a reference, the object referred by t is not allocated any memory.
		// Unlike C++, in Java all non-primitive objects must be explicitly allocated
		// and these objects are allocated on heap.

	}

}
