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
	private QuestionServices service;

	@GetMapping("/take-quiz")
	public List<Question_Details> getQuestions(int quizId) {
		return service.getAllQuestions(quizId);
	}

	@PostMapping("/create-quiz")
	public Question_Details createQuestion(@RequestBody Question_Details question) {
		return service.addQuestion(question);
	}

	@DeleteMapping("/create-quiz/{questionId}")
	public String deleteQuestion(@PathVariable("questionId") int questionId) {
		service.deleteQuestion(questionId);
		return "Question was deleted successfully";
	}

	@PutMapping("/create-quiz/{questionId}")
	public String updateQuestion(@PathVariable("questionId") int questionId,
			@RequestBody Question_Details question) {
		service.updateQuestion(questionId, question);
		return "Question updated successfully";
	}

}
