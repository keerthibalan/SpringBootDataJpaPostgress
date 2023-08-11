package com.spring.data.jpa.repository;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.data.jpa.model.User;

public interface UserRepository extends JpaRepository<User, Id>{
	

}
