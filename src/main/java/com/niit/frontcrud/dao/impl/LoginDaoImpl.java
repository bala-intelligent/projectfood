package com.niit.frontcrud.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.frontcrud.model.Login;

@Repository("LoginDao")

@Transactional

public class LoginDaoImpl implements LoginDao{
	
	@Autowired(required=true)
	private SessionFactory sessionFactory;
	
@Override
	public boolean checkUser(Login u) {
		boolean isvaliduser=false;
		
		Query q=sessionFactory.openSession().createQuery("from Login where name= '"+u.getUsername()+"' and password='"+u.getPassword()+"'");
		List<Login> ul= q.list();
		int s=ul.size();
		if(s==1)
		{
			isvaliduser=true;
		}
		
		return isvaliduser;
	}
	
	public void saveOrUpdate(Login u) {
		sessionFactory.getCurrentSession().saveOrUpdate(u);

	}
}
