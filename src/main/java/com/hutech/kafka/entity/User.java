package com.hutech.kafka.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
//implements Serializable {
	// public static final long SerialVersionUID = 1L;

	@Id
	private Long userId;

	private String userName;
	
	

}
