import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Item } from 'src/app/Model/Item';
import { CustomerServiceService } from 'src/app/Service/customer-service.service';
import { OrderServiceService } from 'src/app/Service/order-service.service';

@Component({
  selector: 'app-orders-details',
  templateUrl: './orders-details.component.html',
  styleUrls: ['./orders-details.component.css']
})
export class OrdersDetailsComponent {
  userId!: Number;
  items: Item[] =[];
  constructor(public router:Router,private route: ActivatedRoute, private customerService: CustomerServiceService,private orderService: OrderServiceService) { 
  }

    ngOnInit() {
this.userId = this.customerService.getUserId();
this.route.paramMap.subscribe(params => {
  var id = Number(params.get('id'));
  console.log("ID ",id);

    this.orderService.getCustomerOrderById(this.userId,id).subscribe((data)=>{
      console.log("Items ",data);
      this.items= data;
     })
  })
}

}