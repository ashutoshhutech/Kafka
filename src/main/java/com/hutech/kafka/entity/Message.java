package com.hutech.kafka.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "message")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
	//implements Serializable{


   // public static final long SerialVersionUID=1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long msgId;

	private String message;

	private String userName;

	private Date timestamp;

	/*
	 * public void setMessage(String kafkaMessage) { // TODO Auto-generated method
	 * stub
	 * 
	 * }
	 */

	public void setUserId(Long userId) {

	}

}
