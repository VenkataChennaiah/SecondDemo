package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserRepo;
import com.model.User;

@Service
public class UserService {
@Autowired
private UserRepo repo;

public User addUser() {
	
	return repo.findAll();
}

public User SaveUser() {
	
	return null;
}

	
}
