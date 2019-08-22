package com.core.demo;

class jp4 {

	protected int x, y;

	jp4() {

	}

	public jp4(int _x, int _y) {
		x = _x;
		y = _y;
	}
}

public class JavaProgram4 {

	public static void main(String[] args) {
		jp4 j = new jp4();
		System.out.println(j.x + " -And- " + j.y);

	}

}
