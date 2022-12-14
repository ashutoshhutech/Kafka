package com.hutech.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hutech.kafka.entity.User;
import com.hutech.kafka.service.UserService;

@RestController
@RequestMapping("/v1/msgs")
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/save")
	public String createUser(@RequestBody User user) {
		return service.createUser(user);
	}

}
