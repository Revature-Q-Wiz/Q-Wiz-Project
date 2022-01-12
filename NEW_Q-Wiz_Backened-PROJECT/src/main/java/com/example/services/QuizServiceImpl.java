package com.example.services;

<<<<<<< Updated upstream

import com.example.entity.Quiz;
import com.example.repository.QuizRepository;


=======
>>>>>>> Stashed changes
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< Updated upstream

@Service
public class QuizServiceImpl implements QuizService{
    
    @Autowired
    private QuizRepository repository;
=======
import com.example.entity.Quiz;
import com.example.entity.User_Info;
import com.example.repository.QuizRepository;
import com.example.repository.User_InfoRepository;


public class QuizServiceImpl implements QuizService {

	
	@Autowired
	private QuizRepository repository; //dependency injection
	
	
	@Override
	public List<Quiz> getAllQuizzes() {
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
>>>>>>> Stashed changes


	@Override
	public User_Info updateUser_Info(User_Info user_info) {
		User_Info user_infoDb = repository.findById(user_info.getUser_id()).get();
		user_infoDb.setFirst_name(user_info.getFirst_name());
		user_infoDb.setLast_name(user_info.getLast_name());
		user_infoDb.setEmail(user_info.getEmail());
		user_infoDb.setPassWord(user_info.getPassWord());
		user_infoDb.setUser_id(user_info.getUser_id());
		user_infoDb.setUserName(user_info.getUserName());

		repository.save(user_infoDb);
		
		return null;
	}

}
