package com.training.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("service")
public class ServiceRequest {

	private String serviceId;
	
	@Autowired
	private Items itemService;
	
	@Autowired
	private Customer customer;

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public Items getItemService() {
		return itemService;
	}

	public void setItemService(Items itemService) {
		this.itemService = itemService;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ServiceRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ServiceRequest [serviceId=" + serviceId + ", itemService=" + itemService + ", customer=" + customer
				+ "]";
	}
	
	
	
}
