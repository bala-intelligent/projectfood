package com.niit.frontcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.frontcrud.model.Registration;
import com.niit.frontcrud.service.impl.RegistrationService;

@Controller
public class RegistrationController {
@Autowired RegistrationService registrationservice;

@RequestMapping(value="/register",method=RequestMethod.GET)
public String getregister()
{
	return "register";
}
@ModelAttribute("fregister")
public Registration moo(){
	return new Registration();
}
@RequestMapping(value="/register",method=RequestMethod.POST)
public ModelAndView rege(@ModelAttribute  Registration ra){
	
	registrationservice.checkuser(ra);
	ModelAndView mv=new ModelAndView("foodproducts");
	return mv;
}
}
