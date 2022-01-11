package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entity.User_Info;
import com.example.repository.User_InfoRepository;


public class User_InfoServiceImpl implements User_InfoService {

	
	@Autowired
	private User_InfoRepository repository; //dependency injection
	
	
	@Override
	public List<User_Info> getAllUser_Info() {
		return repository.findAll();
	}


	@Override
	public User_Info addUser_Info(User_Info user_info) {
		return repository.save(user_info);
	}

	
	@Override
	public User_Info deleteUser_Info(int id) {
		repository.deleteById(id);
		return null;
	}

			
	@Override
	public User_Info getUser_InfoById(int id) {
		return repository.findById(id).get();
		
	}

}
