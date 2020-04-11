import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable} from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  public APIUrl = 'http://localhost:3000/employees';
  public headers = new HttpHeaders({'Content-Type': 'application/json'});
  constructor(
    public http: HttpClient
  ) { }
  getAllEmployee(): Observable<any> {
    return this.http.get(this.APIUrl);
  }
  postEmployee(employee): Observable<any> {
return this.http.post(this.APIUrl,employee);
}
  deleteEmployee(id): Observable<any> {
    return this.http.delete(`${this.APIUrl}/${id}`);
  }

}
