package com.example.services;

import com.example.entity.Question_Details;

import java.util.List;

public interface QuestionServices {

	public List<Question_Details> getAllQuestions();
	
	public Question_Details getQuestionById(int id);
	
	public Question_Details addQuestion(Question_Details question);
	
	public Question_Details deleteQuestion(int id);
	
	public Question_Details 
	updateQuestion(int id, Question_Details question);
}