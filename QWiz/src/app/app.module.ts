import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { QuizComponent } from './quiz/quiz.component';
import { ResultComponent } from './result/result.component';
import { AnswersComponent } from './answers/answers.component';
import { LogoutComponent } from './logout/logout.component';
import { TakeQuizComponent } from './take-quiz/take-quiz.component';
import { MakeQuizComponent } from './make-quiz/make-quiz.component';
import { QuizResultComponent } from './quiz-result/quiz-result.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    QuizComponent,
    ResultComponent,
    AnswersComponent,
    LogoutComponent,
    TakeQuizComponent,
    MakeQuizComponent,
    QuizResultComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
