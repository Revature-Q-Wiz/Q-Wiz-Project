import { Injectable } from "@angular/core";
import {HttpClient} from '@angular/common/http';
import { Observable } from "rxjs";

@Injectable({
    providedIn: 'root'
})
export class DataService{
    constructor(private http:HttpClient){}

    getQuizzes(): Observable<any>{
        return this.http.get('http://localhost:9000/take-quiz')
    }

}