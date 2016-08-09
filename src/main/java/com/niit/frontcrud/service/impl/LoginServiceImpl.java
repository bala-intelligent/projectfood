package com.niit.frontcrud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.frontcrud.dao.impl.LoginDao;
import com.niit.frontcrud.model.Login;
@Service
@Transactional
public class LoginServiceImpl implements LoginService {
	@Autowired(required=true)
	private LoginDao ld;
	
	

	@Override
	public boolean checkUser(Login u) {
		boolean b=false;
		b=ld.checkUser(u);
		if(b==true){
			b=true;
		}
		return b;
	
	}
}
