import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { CustomerData } from '../Model/CustomerData';
import { environment } from 'src/environments/environment';
@Injectable({
  providedIn: 'root'
})
export class CustomerServiceService {
  userId!: Number;
  setUserId(id : Number){
    this.userId = id;
  }
  getUserId(){
    return this.userId;
  }
  constructor(private router: Router,private httpClient: HttpClient) { }

  getAllCustomers(): Observable<any[]> {
    return this.httpClient.get<CustomerData[]>(environment.baseUrl + "/user");

  }

  getCustomersById(id: Number): Observable<any> {
    return this.httpClient.get<CustomerData>(environment.baseUrl + "/user/"+id);

  }

}
