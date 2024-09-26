import { HttpClient, HttpErrorResponse, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { Emp } from './emp';

@Injectable({
  providedIn: 'root'
})
export class CrudService {
  private apiServer = "http://localhost:8085";
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  }

  constructor(private httpClient: HttpClient) { }

  getAll(): Observable<Emp[]> {
    return this.httpClient.get<Emp[]>(this.apiServer + '/employee/')
      .pipe(
        catchError(this.errorHandler)
      )
  }
  getById(id): Observable<Emp> {
    return this.httpClient.get<Emp>(this.apiServer + '/employee/' + id)
      .pipe(
        catchError(this.errorHandler)
      )
  }

  delete(empid): Observable<Emp[]> {
    console.log(this.apiServer + '/employee/' + empid);
    return this.httpClient.delete<Emp[]>(this.apiServer + '/employee/' + empid)
      .pipe(
        catchError(this.errorHandler)
      )
  }

  create(emp): Observable<Emp> {
    console.log("======" + emp.dob);
    return this.httpClient.post<Emp>(this.apiServer + '/employee/', JSON.stringify(emp), this.httpOptions)
      .pipe(
        catchError(this.errorHandler)
      )
  }
  update(emp: Emp): Observable<Emp[]> {
    console.log("======" + emp.name);
    return this.httpClient.put<Emp[]>(this.apiServer + '/employee/', JSON.stringify(emp), this.httpOptions)
      .pipe(
        catchError(this.errorHandler)
      )
  }
  errorHandler(errorResponse: HttpErrorResponse) {
    let errorMessage = '';
    if (errorResponse.error instanceof ErrorEvent) {
      console.log("This is client side Error" + errorMessage)
    } else {
      console.log(errorResponse.error.message);
    }

    return throwError(errorResponse.error.message);
  }
}
