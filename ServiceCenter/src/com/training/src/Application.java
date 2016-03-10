package com.training.src;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.daos.ServiceRequestDAOImpl;
import com.training.entity.Customer;
import com.training.entity.Items;
import com.training.entity.ServiceRequest;
import com.training.entity.TV;


public class Application {

	public static void main(String[] args) {


		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		
		ServiceRequestDAOImpl obj = ctx.getBean("dao",ServiceRequestDAOImpl.class);
		
		ServiceRequest service = ctx.getBean("service",ServiceRequest.class);
		
		Customer cust = (Customer) ctx.getBean("customer",Customer.class);
		
		cust.setCustomerName("Rajesh");
		cust.setMobileNumber("5412544");
	
		service.setServiceId("107");
		service.setCustomer(cust);
		service.setItemService(service.getItemService());
		
		boolean result = obj.add(service);
		
		System.out.println("Row Added: " + result);
		
		System.out.println(service);
		
		List<ServiceRequest> serviceList = obj.findAll();
		
		for(ServiceRequest req: serviceList) {
		
			System.out.println(req);
		}
	}

}
