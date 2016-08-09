package com.niit.frontcrud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.frontcrud.dao.impl.RegistrationDao;
import com.niit.frontcrud.model.Registration;
@Service
@Transactional
public class RegistrationServiceImpl implements RegistrationService{
	@Autowired RegistrationDao rd;

	@Override
	public void checkuser(Registration ra) {
		// TODO Auto-generated method stub
		rd.createuser(ra);
	}

}
