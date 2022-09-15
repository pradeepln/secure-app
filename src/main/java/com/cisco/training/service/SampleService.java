package com.cisco.training.service;

import javax.annotation.security.RolesAllowed;

import org.springframework.stereotype.Service;

@Service
public class SampleService {

	
	public String dataForAnyone() {
		return "data in public domain";
	}
	
	@RolesAllowed("user")
	public String sensitiveData() {
		return "sensitive data for logged in users only";
	}
	
	@RolesAllowed("admin")
	public String highlySensitiveData() {
		return "highly sensitive data for admin only";
	}
	
	
}
