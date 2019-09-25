package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class AdminService {

	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "hiError")
	public String sayHi(String message) {
		return restTemplate.getForObject("http://service-admin/hi?message="+message,String.class);
	}
	
	public String hiError(String message) {
		return String.format("Hi your message is : %s but request bad",message);
	}
	
}
