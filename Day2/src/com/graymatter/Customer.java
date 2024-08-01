
package com.graymatter;

import java.util.Date;

public class Customer extends Person {
	
	private double orderSum;
	private int orderId;
	
	
	Customer() {
		super();
	}


	Customer(String name, int id, String mobile, String email, Date dob, double orderSum, int orderId) {
		super(name, id, mobile, email, dob);
		this.orderSum = orderSum;
		this.orderId = orderId;
	}


	@Override
	public String toString() {
		return "Customer [orderSum=" + orderSum + ", orderId=" + orderId + ", toString()=" + super.toString() + "]";
	}
	
	


	
	
	
	

}
