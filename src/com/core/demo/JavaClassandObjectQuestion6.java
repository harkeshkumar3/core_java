package com.core.demo;

public class JavaClassandObjectQuestion6 {

	int a = 1;
	int b = 2;

	JavaClassandObjectQuestion6 func(JavaClassandObjectQuestion6 obj) {
		JavaClassandObjectQuestion6 obj3 = new JavaClassandObjectQuestion6();
		obj3 = obj;
		obj3.a = obj.a++ + ++obj.b;
		obj.b = obj.b;
		return obj3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaClassandObjectQuestion6 obj1 = new JavaClassandObjectQuestion6();
		JavaClassandObjectQuestion6 obj2 = obj1.func(obj1);

		System.out.println("obj1.a = " + obj1.a + "  obj1.b = " + obj1.b);
		System.out.println("obj2.a = " + obj2.a + "  obj1.b = " + obj2.b);

	}

}
