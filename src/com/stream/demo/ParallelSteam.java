package com.stream.demo;

import java.util.Arrays;
import java.util.List;

public class ParallelSteam {
	
	public static int transform(int number) throws Exception {
		System.out.println("Transform"+ number +" "+ Thread.currentThread());
		Thread.sleep(3000);
		return number;
	}
	
	public static void printIt(int number) {
		System.out.println(number + " "+ Thread.currentThread());
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7,8,9,10);
		numbers.parallelStream()
		.map(t -> {
			try {
				return transform(t);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				return 0;
			}
		})
		// .sequential()
		.forEachOrdered(ParallelSteam::printIt);

	}

}
