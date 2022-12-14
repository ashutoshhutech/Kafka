package com.hutech.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hutech.kafka.entity.Message;
import com.hutech.kafka.entity.User;
import com.hutech.kafka.service.ProducerService;

@RestController
@RequestMapping("/v1/msgs")
public class KafkaController {

	@Autowired
	private ProducerService producerService;

	@PostMapping("/send/{userId}")
	public String sendMessage(@RequestParam("msg")String message,@PathVariable Long userId){
		return producerService.publishToTopic(message,userId);
	}

	// @PutMapping("/send/{userId}")
	// public String sendMessage(@RequestParam("msg")String message,@PathVariable
	// User user) {
	// return producerService.publishToTopic(message, user);
	// }
/*
	@PostMapping("/send/{   }")
	public String sendMessage(@RequestParam("content") String message, @PathVariable User user) {
		return producerService.publishToTopic(message, user);
	}*/
}
