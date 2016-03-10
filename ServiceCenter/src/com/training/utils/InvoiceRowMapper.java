package com.training.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.training.entity.Customer;
import com.training.entity.ServiceRequest;

public class InvoiceRowMapper implements RowMapper<ServiceRequest> {

	@Override
	public ServiceRequest mapRow(ResultSet rs, int rowCount) throws SQLException {

		ServiceRequest inv = new ServiceRequest();
		Customer cust = new  Customer();
		cust.setCustomerName(rs.getString("customerName"));
		
		inv.setServiceId(rs.getString("serviceId"));

		inv.setCustomer(cust);
		
		return inv;
	}

}
