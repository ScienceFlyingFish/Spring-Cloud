package com.spring.service.hystrix;

import org.springframework.stereotype.Component;

import com.spring.service.AdminService;

@Component
public class AdminServiceHystrix implements AdminService{

	@Override
	public String sayhi(String message) {
		return String.format("Hi your message is : %s but request bad",message);
	}
	
}
