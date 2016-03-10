package com.training.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customer")
public class Customer {

	//@Value("Suresh")
	private String customerName;
	
	//@Value("12345")
	private String mobileNumber;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", mobileNumber=" + mobileNumber + "]";
	}
	
	
	
}
