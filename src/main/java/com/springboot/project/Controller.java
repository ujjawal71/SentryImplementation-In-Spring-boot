package com.springboot.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	ServiceImpl serviceImpl;
	
	@GetMapping(value = "/checking")
	public ResponseEntity<?>  adminSignIn()
	{
		
	
		return serviceImpl.checkAdmin();

	}

}
