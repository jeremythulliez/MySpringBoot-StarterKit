package com.sk.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

	private static final String HELLO = "Hello love !";
	
	@RequestMapping(value = "/sayhello", method = RequestMethod.GET)
	public String sayHello(HttpServletRequest req){
		return HELLO;
	}
	
	
}
