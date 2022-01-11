package com.example.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Quiz;

@Service
public interface QuizService {
	
	public List<Quiz> getAllQuizzes();
    public Quiz getQuizById(int id);
    public Quiz addQuiz(Quiz quiz);
    public void deleteQuiz(int id);
    public Quiz updateQuiz(int id, Quiz quiz);



    

}
