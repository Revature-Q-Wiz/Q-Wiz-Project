package com.example.services;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.example.entity.Question_Details;
import com.example.entity.User_Info;
import com.example.repository.Question_Details_Repository;
import com.example.repository.User_InfoRepository;


	public class QuestionServicesImpl implements QuestionServices {
		
		@Autowired
		private Question_Details_Repository repository;

		@Override
		public List<Question_Details> getAllQuestions() {
			
			return null;
		}

		@Override
		public Question_Details getQuestionById(int id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Question_Details addQuestion(Question_Details question) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Question_Details deleteQuestion(int id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Question_Details updateQuestion(int id, Question_Details question) {
			// TODO Auto-generated method stub
			return null;
		}

		
	}