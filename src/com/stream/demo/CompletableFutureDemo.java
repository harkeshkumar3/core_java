package com.stream.demo;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo {

	public static int genrate() {
		System.out.println("DO WORK" + " " + Thread.currentThread());
		return 2;
	}

	public static void printI(int value) {
		System.out.println(value + " " + Thread.currentThread());
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CompletableFuture<Integer> future = CompletableFuture.supplyAsync(CompletableFutureDemo::genrate);
		future.thenAccept(CompletableFutureDemo::printI);
		System.out.println("In Main");

	}

}
