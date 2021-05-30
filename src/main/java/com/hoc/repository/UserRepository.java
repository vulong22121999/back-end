package com.hoc.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hoc.entity.UserEntity;

public interface UserRepository extends MongoRepository<UserEntity, Integer> {
	
}
