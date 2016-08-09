package com.niit.frontcrud.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.frontcrud.model.Registration;
@Repository
@Transactional
public class RegistrationDaoImpl implements RegistrationDao{
@Autowired SessionFactory sf;
	@Override
	public void createuser(Registration ra) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().saveOrUpdate(ra);
	}

}
