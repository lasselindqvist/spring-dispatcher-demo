package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/api/hello")	
	public ResponseEntity<String> checkAlive() {
		return ResponseEntity.ok().body("hello");		
	}
}
