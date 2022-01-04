import {Routes} from '@angular/router';
import { RegisterComponent } from './app/register/register.component';
import { LoginComponent } from './app/login/login.component';
import { CreateQuizComponent } from './app/create-quiz/create-quiz.component';
import { TakeQuizComponent } from './app/take-quiz/take-quiz.component';
import { LeaderboardComponent } from './app/leaderboard/leaderboard.component';
import { LogoutComponent } from './app/logout/logout.component';


export const appRoutes : Routes = [

    {path: '', redirectTo: '/login', pathMatch: 'full'},
    {path: 'login', component: LoginComponent},
    {path: 'register', component: RegisterComponent},
    {path: 'create-quiz', component: CreateQuizComponent},
    {path: 'take-quiz', component:TakeQuizComponent},
    {path: 'leaderboard', component:LeaderboardComponent},
    {path: 'logout', component:LogoutComponent}

];