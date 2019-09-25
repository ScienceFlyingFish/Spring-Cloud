package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.service.AdminService;

@RestController
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	
	@RequestMapping(value="hi",method = RequestMethod.GET)
	public String sayhi(String message) {
		return adminService.sayhi(message);
	}
}
