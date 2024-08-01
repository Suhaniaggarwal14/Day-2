
package com.graymatter;

public class Employee {
	
	private final String name ="amit" ; //constants- cannot change the properties
	protected String compName;
	
	public void changeName(String name)
	{
		//this.name=name;
	}
	
	public final void printDetails() 
	{
		System.out.println(this.compName);
	}
	
//	public FinalClass(String name)
//	{
//		this.name=name;
//	}
//
//	public FinalClass() {
//		// TODO Auto-generated constructor stub
//		this.name="raj";
//	}
	
//	public FinalClass(String name)
//	{
//		this.name=name; //cannot be changed
//	}

}
