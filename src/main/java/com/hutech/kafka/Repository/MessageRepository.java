
package com.hutech.kafka.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hutech.kafka.entity.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

	// Message save(String message);

}
