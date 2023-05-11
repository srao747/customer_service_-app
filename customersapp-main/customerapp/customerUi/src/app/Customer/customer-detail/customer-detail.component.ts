import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { CustomerData } from 'src/app/Model/CustomerData';
import { CustomerServiceService } from 'src/app/Service/customer-service.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-customer-detail',
  templateUrl: './customer-detail.component.html',
  styleUrls: ['./customer-detail.component.css']
})
export class CustomerDetailComponent {
  customerData: CustomerData = { id: 0, name: '', email: '', age: 0, address:  '', number: '',orders: [] };

  constructor(public router:Router,private route: ActivatedRoute, private customerService: CustomerServiceService) { 
  }

  ngOnInit() {
    this.route.paramMap.subscribe(params => {
      var id = Number(params.get('id'));
      console.log("ID ",id);
      this.customerService.getCustomersById(id).subscribe((data)=>{
        console.log(data);
        this.customerData = data;
      })
    });
  }


}
