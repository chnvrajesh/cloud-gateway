package com.nvrviews.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class FallbackController {
	
	@GetMapping("/courseServiceFallback")
	public String courseServiceFallback() {
		log.info("Course Service fallack");
		System.out.println("Rajesh");
		return "Course Servcie is not Available";
	}

	@GetMapping("/studentServiceFallback")
	public String studentServiceFallback() {
		return "Student Servcie is not Available";
	}
}
