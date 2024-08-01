
package com.graymatter;

public class Student {
	
	private String name;
	private int id;
	
	Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
	
	
	

}
