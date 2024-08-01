
package com.graymatter;

public class OuterClass { 
	
	static class Inner{
		
		String name;
	}
	
	public static void main(String[] args) {
		// OuterClass.Inner i =new OuterClass.new Inner(); //used only when the inner class is non-static
		Inner i =new Inner(); 
	}

}
