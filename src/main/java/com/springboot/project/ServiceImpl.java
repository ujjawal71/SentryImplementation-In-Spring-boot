package com.springboot.project;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class ServiceImpl {
	
	@Autowired
	CaptureException captureException;


	public ResponseEntity<?> checkAdmin() {
		HashMap<String, Object> map = new HashMap<>();
	
		int i=10,j=0,z=0;
		try {
			
			
			z=i/j;
			
	System.out.println("ok testing"+z);

		} catch (Exception e) {
			captureException.Capture(e);
			throw e;
		
			
		}

		if (map.size() <= 0) {
			map.put("message", "data not available");
			// return ResponseEntity.of(Optional.of(map));
			

		}

		return ResponseEntity.ok(map);
	}

	
}
