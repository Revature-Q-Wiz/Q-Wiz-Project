package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Question_Details;
import com.example.services.QuestionServices;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class QuestionController {

	@Autowired
	private QuestionServices queService;
	
	@GetMapping("/questions")
	public List<Question_Details> getQuestions() {
		return queService.getAllQuestions();
	}
	
	@GetMapping("/questions/{id}")
	public Question_Details getQuestionByID(@PathVariable("id") int id) {
		return queService.getQuestionById(id);
	}
	
	@PostMapping("/questions")
	public Question_Details createQuestion
	(@RequestBody Question_Details question) {
		return queService.addQuestion(question);
	}
	
	@DeleteMapping("/questions/{id}")
	public String deleteQuestion(@PathVariable("id") int id) {
		queService.deleteQuestion(id);
		return "Question was deleted successfully";
	}
	
	@PutMapping("/questions/{id}")
	public String updateQuestion(@PathVariable("id") int id, 
			@RequestBody Question_Details question) {
		queService.updateQuestion(id, question);
		return "Question updated successfully";
	}
	
}
