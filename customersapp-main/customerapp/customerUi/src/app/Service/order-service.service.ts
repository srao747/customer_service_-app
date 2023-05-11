import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { CustomerData } from '../Model/CustomerData';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { Order } from '../Model/Order';
import { Item } from '../Model/Item';

@Injectable({
  providedIn: 'root'
})
export class OrderServiceService {

  constructor(private router: Router,private httpClient: HttpClient) { }


  
  getCustomerOrder(id: Number): Observable<any> {
    return this.httpClient.get<Order>(environment.baseUrl + "/user/"+id+"/orders");

  }

  
  
  getCustomerOrderById(customerId: Number, orderId: Number): Observable<any> {
    return this.httpClient.get<Item[]>(environment.baseUrl + "/user/"+customerId+"/orders/"+orderId);

  }


}
