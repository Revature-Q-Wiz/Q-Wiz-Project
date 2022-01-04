import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { CreateQuizComponent } from './create-quiz/create-quiz.component';
import { CreateQuestionAnswerComponent } from './create-question-answer/create-question-answer.component';
import { NavbarComponent } from './navbar/navbar.component';
import { TakeQuizComponent } from './take-quiz/take-quiz.component';
import { ResultComponent } from './result/result.component';
import { CreateTagsComponent } from './create-tags/create-tags.component';
import { FilterByTagsComponent } from './filter-by-tags/filter-by-tags.component';
import { LeaderboardComponent } from './leaderboard/leaderboard.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    CreateQuizComponent,
    CreateQuestionAnswerComponent,
    NavbarComponent,
    TakeQuizComponent,
    ResultComponent,
    CreateTagsComponent,
    FilterByTagsComponent,
    LeaderboardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
