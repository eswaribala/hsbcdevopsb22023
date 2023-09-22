package com.hsbc.banking.models;

import java.time.LocalDate;

public class Customer {
	
	private long customerId;
	private String name;
	private LocalDate dob;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(long customerId, String name, LocalDate dob) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.dob = dob;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	

}
