import { Order } from "./Order";

export interface CustomerData{
     id: Number;
     name: String;
     email: String;
     age: Number,
     address: String,
     number: String,
     orders: Array<Order>;
}