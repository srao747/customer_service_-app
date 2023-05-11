import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CustomerData } from 'src/app/Model/CustomerData';
import { CustomerServiceService } from 'src/app/Service/customer-service.service';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {
 
  customerList: CustomerData[] = [];
  fileteredCustomerList: CustomerData[] = [];

  constructor(public router:Router,private customerService: CustomerServiceService) { }

  ngOnInit() {
    console.log("INSIDE");
this.customerService.getAllCustomers().subscribe((data)=>{
  console.log(data);
  this.customerList = data;
  this.fileteredCustomerList = this.customerList;
})

    
  }



}
