package com.stream.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create a list of integers 
	    List<Integer> number = Arrays.asList(2,3,4,5);
	    
	    List<Integer> numberList = number.stream()
	    	.map(s-> s*s)
	    	.collect(Collectors.toList());
	    
	    System.out.println(numberList);
	    
	    // create a list of String 
	    List<String> names = 
	                Arrays.asList("Reflection","Collection","Stream");
	    
	    List<String> nameList = names.stream()
	    	.filter(s-> s.startsWith("S"))
	    	.collect(Collectors.toList());
	    System.out.println(nameList);
	    
	    List<String> nameSortList = names.stream()
	    	.sorted()
	    	.collect(Collectors.toList());
	    System.out.println(nameSortList);
	    System.out.println(
	    number.stream()
	    .map(s-> s*s)
	    .collect(Collectors.toSet()));
	    
	    number.stream()
		.map(s->s*s)
		.forEach(s->System.out.print(s));
	    System.out.println("");
	    System.out.println(	"Reduce value is ::::"+    		
	    		number.stream()
	    		//	.filter(s-> s%2==0)
	    			.reduce(0,(ans,i)-> ans+i)
	    		
	    		);

	}

}
