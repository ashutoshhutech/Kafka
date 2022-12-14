package com.hutech.kafka.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hutech.kafka.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}
