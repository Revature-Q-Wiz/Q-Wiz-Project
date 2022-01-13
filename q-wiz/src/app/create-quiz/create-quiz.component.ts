import { Component, OnInit } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-create-quiz',
  templateUrl: './create-quiz.component.html',
  styleUrls: ['./create-quiz.component.css']
})
export class CreateQuizComponent implements OnInit {

  createdQs: CreatedQuiz[] = [];


  constructor() { }

  ngOnInit(): void {
  }

  onClickSubmit(data: any ){
    alert("Quiz " + data.title + " has been created!");
  }

}
