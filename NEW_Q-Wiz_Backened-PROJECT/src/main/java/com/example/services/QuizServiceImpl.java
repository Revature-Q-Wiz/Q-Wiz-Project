package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Quiz;
import com.example.repository.QuizRepository;




@Service
public class QuizServiceImpl implements QuizService {
	
	
	 @Autowired
	    private QuizRepository repository;

	    @Override
	    public List<Quiz> getAllQuizzes() {
	        return repository.findAll();
	    }

	    @Override
	    public Quiz getQuizById(int id) {
	        return repository.findById(id).get();
	    }

	    @Override
	    public Quiz addQuiz(Quiz quiz) {
	        return repository.save(quiz);
	    }

	    @Override
	    public void deleteQuiz(int id) {
	        repository.deleteById(id);
	    }

	    @Override
	    
	    public Quiz updateQuiz(int id, Quiz quiz) {
	        Quiz quizDb = repository.findById(id).get();
//	        quizDb.setName(quiz.getName());
//	        quizDb.setEmail(quiz.getEmail());
	        return repository.save(quizDb);
	    }

}
