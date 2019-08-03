package com.inheritance.dmo;

/**
 * Immuatable Class with two Property
 * A Immuatable class need to have some requirement 
 * It should have only private final data veriables
 * It Should have parameter constructor 
 * Its Only have getter method so no future implimations can  modified 
 * @author harkesh
 *
 */
public  final class ImmutableClass {

	/**
	 * Declare data member should be final private
	 */
	private final  int id;
	private final String name;
	
	
	/**
	 * One constructor should there to set the initail value
	 */
	ImmutableClass(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	/**
	 * Only All Getter Methods No setter methods
	 * @return
	 */
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	
}
