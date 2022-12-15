package com.hutech.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	
	
	
	@PostMapping("/message/{orderId}")
	public String sendKafkaMessage(@RequestBody Message message, @PathVariable Long orderId) {
		
		//Authurization and authentication should be done here.
		
		message.setUserName("Ashutosh");
		message.setOrderId(orderId);
		return producerService.publishToTopic(message);
	}

	
}
