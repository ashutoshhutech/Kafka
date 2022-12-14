package com.hutech.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hutech.kafka.Repository.UserRepo;
import com.hutech.kafka.entity.User;

@Service
public class UserService {

	@Autowired
	private UserRepo repo;

	public String createUser(User user) {
		repo.save(user);
		return "Saved Succesfuly";
	}

}
