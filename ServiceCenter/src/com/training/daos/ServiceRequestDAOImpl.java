package com.training.daos;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.training.entity.ServiceRequest;
import com.training.ifaces.MyDAO;
import com.training.utils.InvoiceRowMapper;

public class ServiceRequestDAOImpl extends JdbcDaoSupport implements MyDAO<ServiceRequest> {

	@Override
	public boolean add(ServiceRequest t) {

		boolean result= false;
		
		try{
			String sql = "insert into ServiceRequest values (?,?,?)";
		
			int rowInserted = getJdbcTemplate().update(sql, t.getServiceId(), t.getCustomer().getCustomerName(),t.getItemService().getItemName());
		
		if(rowInserted > 0) {
			
			result= true;
		}
		}
		catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
		return result;
	}

	@Override
	public List<ServiceRequest> findAll() {

		String sql = "select * from serviceRequest";
		
		//List<ServiceRequest> serviceList = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(ServiceRequest.class));
		
			List<ServiceRequest> serviceList = getJdbcTemplate().query(sql, new InvoiceRowMapper());
		
		return serviceList;
	}

}
