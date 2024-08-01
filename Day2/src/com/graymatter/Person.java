
package com.graymatter;

import java.util.Date;

public class Person {
	
	private String Name;
	private int id;
	private String mobile;
	private String email;
	private Date dob;
	
	Person() {
		super(); //not needed 
		System.out.println("from peron");
	}
	
	Person(String name, int id, String mobile, String email, Date dob) {
		super();
		System.out.println("from peron with parameters");

		Name = name;
		this.id = id;
		this.mobile = mobile;
		this.email = email;
		this.dob = dob;
		
		
	}

	@Override
	public String toString() {
		return "Person [Name=" + Name + ", id=" + id + ", mobile=" + mobile + ", email=" + email + ", dob=" + dob + "]";
	}
	
	
	
}
