package com.example.services;

import com.example.entity.Employee;
import com.example.entity.Quiz;

import org.springframework.stereotype.Service;

public interface QuizService {
    public List<Quiz> getAllQuizzes();
    public Quiz getQuizById(int quiz_id);
    public Quiz addQuiz(Quiz quiz);
}
