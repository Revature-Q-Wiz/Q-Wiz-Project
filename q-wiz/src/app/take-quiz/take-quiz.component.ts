import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/services/data.service';

@Component({
  selector: 'app-take-quiz',
  templateUrl: './take-quiz.component.html',
  styleUrls: ['./take-quiz.component.css']
})
export class TakeQuizComponent implements OnInit {

quizzes: any[] = []

  constructor(private dataService: DataService) {

    dataService.getQuizzes().subscribe(data => {
      this.quizzes = data
    })


   }

  ngOnInit(): void {
  }

}
