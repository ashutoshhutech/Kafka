package com.hutech.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.hutech.kafka.Repository.MessageRepository;
import com.hutech.kafka.Repository.UserRepo;
import com.hutech.kafka.entity.Message;
import com.hutech.kafka.entity.User;

@Service
public class ProducerService {

	public static String topic = "mytopic";

	@Autowired
	private UserRepo repo;
	
	@Autowired
	private MessageRepository mRepo;

	@Autowired
	private KafkaTemplate<String, Long > kafkaTemplate;
	
	
	
	public String publishToTopic(String message,Long userId) {

		User user = repo.findById(userId).get();
		String userName=user.getUserName();
		if (userId != null) {
			
			//Message msg = new Message ();
			//msg.setUserName(user.getUserName());

			this.kafkaTemplate.send(topic, message,userId);
			return "send";

		}
		return "Not Send";
	}

	/*
	 * public String publishToTopic(String message, User user) {
	 * 
	 * //User user = repo.findById(user).get(); //String
	 * userName=user.getUserName(); if (user != null) {
	 * 
	 * Message msg = new Message (); msg.setUserName(user.getUserName());
	 * 
	 * this.kafkaTemplate.send(topic, message,user); return "send";
	 * 
	 * } return "Not Send"; }
	 */

}
