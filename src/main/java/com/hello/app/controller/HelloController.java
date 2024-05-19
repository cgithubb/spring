package com.hello.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hello.app.model.EmployeeModel;
import com.hello.app.service.HelloService;

@RestController
@RequestMapping("/api")
public class HelloController {
	
	HelloController(HelloService helloService) {
		this.helloService = helloService;
	}

	private HelloService helloService;
	
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World!";
	}
	
	@GetMapping("/getEmployees")
	public List<EmployeeModel> getEmployeeDetail() {
		return helloService.getAllEmployees();
	}
	
}
