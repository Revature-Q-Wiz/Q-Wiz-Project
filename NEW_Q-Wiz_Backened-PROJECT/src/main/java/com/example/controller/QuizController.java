package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Quiz;
import com.example.services.QuizService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class QuizController {

	@Autowired
	private QuizService service;

	@GetMapping("/quizzes")
	public List<Quiz> getQuizzes() {
		return service.getAllQuizzes();
	}

	@GetMapping("/quizzes/{id}")
	public Quiz getQuizById(@PathVariable("id") int id) {
		return service.getQuizById(id);
	}

	@PostMapping("/quizzes")
	public Quiz createQuiz(@RequestBody Quiz quiz) {
		return service.addQuiz(quiz);
	}

	@DeleteMapping("/quizzes/{id}")
	public String deleteQuiz(@PathVariable("id") int id) {
		service.deleteQuiz(id);
		return "record deleted successfully";
	}

	@PutMapping("/quizzes/{id}")
	public String updateQuiz(@PathVariable("id") int id, @RequestBody Quiz quiz) {
		service.updateQuiz(id, quiz);
		return "record updated successfully";
	}

}
