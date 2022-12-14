package com.hutech.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.hutech.kafka.Repository.MessageRepository;
import com.hutech.kafka.Repository.UserRepo;
import com.hutech.kafka.entity.Message;
import com.hutech.kafka.entity.User;

@Service
public class ConsumerService {

	@Autowired
	MessageRepository  messageRepository;
	
	
	@Autowired
	private UserRepo repo;
	
	
	@Autowired
	private ProducerService producerService;
	
	
	
	
	@KafkaListener(topics = "mytopic", groupId = "mygroup")
	public void consumeFromTopic(String kafkaMessage,Long userId) {
		
		
		User user=new User();
		Message message = new Message();
		message.setUserId(user.getUserId());
		message.setMessage(kafkaMessage);
		messageRepository.save(message);
		
		
	}
	
	/*
	 * @KafkaListener(topics = "mytopic", groupId = "mygroup") public void
	 * consumeFromTopic(String kafkaMessage,Long userId) {
	 * 
	 * 
	 * User user=new User(); Message message = new Message();
	 * message.setUserId(user.getUserId()); message.setMessage(kafkaMessage);
	 * messageRepository.save(message);
	 * 
	 * 
	 * }
	 */
	
	
	/*
	 * @KafkaListener(topics = "mytopic", groupId = "mygroup") public void
	 * consumeFromTopic(String kafkaMessage,User user) {
	 * 
	 * Message message = new Message(); message.setUserName(user.getUserName());
	 * message.setMessage(kafkaMessage); messageRepository.save(message);
	 * 
	 * 
	 * }
	 */
}
