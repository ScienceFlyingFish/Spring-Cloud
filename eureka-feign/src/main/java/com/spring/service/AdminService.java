package com.spring.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.service.hystrix.AdminServiceHystrix;

@FeignClient(value="service-admin", fallback = AdminServiceHystrix.class)
public interface AdminService {
	
	@RequestMapping(value="hi",method=RequestMethod.GET)
	public String sayhi(@RequestParam(value="message")String message);

	
	
}
