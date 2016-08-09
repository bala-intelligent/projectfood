/*package com.niit.frontcrud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.frontcrud.model.Login;
import com.niit.frontcrud.service.impl.LoginService;

@Controller
public class LoginController
{
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	
	@Autowired(required=true)
	LoginService ls;

	@Autowired(required=true)
	Login u;

	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView loginuser(@RequestParam("name") String name, @RequestParam("pwd") String pwd) {
		boolean isvaliduser = false;
		u.setUsername(name);
		u.setPassword(pwd);
		isvaliduser = ls.checkUser(u);
		ModelAndView mv = null;
		if (isvaliduser == true) {
			 mv = new ModelAndView("success");
			mv.addObject("msg", "Welcome");
			mv.addObject("name", u.getUsername());
		}
		return mv;
	}

}*/
