package com.cisco.training.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cisco.training.service.SampleService;

@RestController
public class SampleController {

	@Autowired
	SampleService service;
	
	@GetMapping("/greeting")
	public String forAnyone() {
		try {
			return "Hello, This is "+service.sensitiveData();
		}catch (Exception e) {
			return "Hello anyways, access denied :( ";
		}
	}
	
	@GetMapping("/securegreeting")
	public String forUsersOnly() {
		return "Hello, This is "+service.sensitiveData();
	}
	
	@GetMapping("/admin/greeting")
	public String forAdminOnly() {
		return "Hello, This is "+service.highlySensitiveData();
	}
}
