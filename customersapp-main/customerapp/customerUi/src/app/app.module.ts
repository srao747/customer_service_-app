import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CustomerComponent } from './Customer/customer/customer.component';
import { RouterModule, Routes } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { OrdersComponent } from './Order/orders/orders.component';
import { CustomerDetailComponent } from './Customer/customer-detail/customer-detail.component';
import { OrdersDetailsComponent } from './Order/orders-details/orders-details.component';



const appRoutes: Routes = [ 
  { path: 'customer', component: CustomerComponent},
  { path: 'orders/:id', component: OrdersComponent},
  { path: 'customer-detail/:id', component: CustomerDetailComponent},
  { path: 'order-details/:id', component: OrdersDetailsComponent},
  
];


@NgModule({
  declarations: [
    AppComponent,
    CustomerComponent,
    OrdersComponent,
    CustomerDetailComponent,
    OrdersDetailsComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(appRoutes,{enableTracing: true}),
    HttpClientModule,
    AppRoutingModule
    
 
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
