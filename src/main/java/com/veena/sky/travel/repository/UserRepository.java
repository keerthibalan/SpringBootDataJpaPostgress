package com.veena.sky.travel.repository;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veena.sky.travel.model.User;

public interface UserRepository extends JpaRepository<User, Id>{
	

}
