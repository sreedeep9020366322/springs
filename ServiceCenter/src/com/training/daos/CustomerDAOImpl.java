package com.training.daos;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.training.entity.ServiceRequest;
import com.training.ifaces.MyDAO;

public class CustomerDAOImpl extends JdbcDaoSupport implements MyDAO<ServiceRequest> {

	@Override
	public boolean add(ServiceRequest t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<ServiceRequest> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
