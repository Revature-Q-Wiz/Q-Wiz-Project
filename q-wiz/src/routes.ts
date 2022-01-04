import {Routes} from '@angular/router';
import { LoginRegisterComponent } from './app/login-register/login-register.component';
import { CreateQuizComponent } from './app/create-quiz/create-quiz.component';
import { TakeQuizComponent } from './app/take-quiz/take-quiz.component';
import { LeaderboardComponent } from './app/leaderboard/leaderboard.component';
import { LogoutComponent } from './app/logout/logout.component';


export const appRoutes : Routes = [

    {path: '', redirectTo: '/login', pathMatch: 'full'},
    {path: 'login-register', component: LoginRegisterComponent},
    {path: 'create-quiz', component: CreateQuizComponent},
    {path: 'take-quiz', component:TakeQuizComponent},
    {path: 'leaderboard', component:LeaderboardComponent},
    {path: 'logout', component:LogoutComponent}

];