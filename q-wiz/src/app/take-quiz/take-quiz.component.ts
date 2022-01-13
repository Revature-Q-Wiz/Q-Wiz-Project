import { Component, OnInit } from '@angular/core';
import { Quiz } from '../quiz.model';
import {QuizService } from 'src/app/quiz.service';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'app-take-quiz',
  templateUrl: './take-quiz.component.html',
  styleUrls: ['./take-quiz.component.css']
})
export class TakeQuizComponent implements OnInit {


quizzes: Quiz[] = [];
currentQuiz = 0;
answerSelected = false;
correctAnswers = 0;
incorrectAnswers = 0;
score = 0;

result = false;

  constructor(private quizService: QuizService) { }

  ngOnInit(): void {
this.quizzes = this.quizService.getQuizzes();
  }

  onAnswer(correct: boolean){
    this.answerSelected = true;
    setTimeout(() => {
      this.currentQuiz++;
      this.answerSelected = false;
    }, 2000);

    if(correct){
      this.correctAnswers++;
    }
    else
    this.incorrectAnswers++;

    this.score = (this.correctAnswers/this.quizzes.length * 100);
    
  }

  showResult(){
    this.result = true;
  }

}
