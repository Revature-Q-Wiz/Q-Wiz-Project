package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "answer_details")
public class Choices {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int answer_id;
	
	@ManyToOne
	@Column (name = "quiz_id")
	private int quizId;
	
	@ManyToOne
	@Column (name = "question_id")
	private int questionId;
	
	@Column (name = "is_correct ")
	private boolean isCorrect;

	@Column (name = "answer")
	private String answer;
}
