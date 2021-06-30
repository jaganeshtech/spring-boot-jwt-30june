package com.javainuse.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@org.springframework.web.bind.annotation.RestController
@CrossOrigin()
public class RestApiController {

	@RequestMapping({ "/api" })
	public String hello() {
		return "JWT working with API endpoints";
	}

}
