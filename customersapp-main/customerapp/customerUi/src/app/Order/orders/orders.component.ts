import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Order } from 'src/app/Model/Order';
import { CustomerServiceService } from 'src/app/Service/customer-service.service';
import { OrderServiceService } from 'src/app/Service/order-service.service';

@Component({
  selector: 'app-orders',
  templateUrl: './orders.component.html',
  styleUrls: ['./orders.component.css']
})
export class OrdersComponent {
orderData :  Order [] = [];
  constructor(public router:Router,private route: ActivatedRoute, private customerService: CustomerServiceService,private orderService: OrderServiceService) { 
  }


  ngOnInit() {
    this.route.paramMap.subscribe(params => {
      var customerId = Number(params.get('id'));
      this.customerService.setUserId(customerId);
      console.log("CUSTOMER ID ",customerId);
      this.orderService.getCustomerOrder(customerId).subscribe((data)=>{
        console.log("order",data);
        this.orderData = data;
      })
    });
  }

  orderDetail(id: Number){
    console.log("Inside onclick ", id);
    this.router.navigate(['order-details/'+id])
  }
}
