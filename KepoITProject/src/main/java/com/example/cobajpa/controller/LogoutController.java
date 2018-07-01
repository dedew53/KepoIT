package com.example.cobajpa.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Controller 
public class LogoutController {
	
	@CrossOrigin
	@RequestMapping(method= RequestMethod.POST, value="/logout.html", produces="text/plain")
	
	public String logout() throws ServletException{
		HttpServletRequest request= ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
		request.logout();
			return"index";
	}
}
