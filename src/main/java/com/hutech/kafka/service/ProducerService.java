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
	private KafkaTemplate<String,Message > kafkaTemplate;

	public String publishToTopic(Message message) {
	
		
			this.kafkaTemplate.send(topic, message);
			return "Message Sent";
		}


}
