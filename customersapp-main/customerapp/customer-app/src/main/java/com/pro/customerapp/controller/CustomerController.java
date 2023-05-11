package com.pro.customerapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pro.customerapp.model.Customer;
import com.pro.customerapp.model.CustomerData;
import com.pro.customerapp.model.Item;
import com.pro.customerapp.model.Order;
import com.pro.customerapp.service.CustomerService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@CrossOrigin("*")
public class CustomerController {
 
    @Autowired
   CustomerService customerService;

    @GetMapping("/user")
    public List<CustomerData> getAllUsers() {
        log.info("get all user");
        System.out.println("LLLLLLLLLL ");
        List<CustomerData> userList = customerService.getCustomersData();
        return userList;
    }

    @GetMapping("/user/{id}")
    public CustomerData getUserById(@PathVariable("id") int id) {
        log.info("get a user");
        System.out.println("LLLLLLLLLL ");
        CustomerData customer = customerService.getCustomer(id);
        
        return customer;
    }

    @GetMapping("/user/{id}/orders")
    public List<Order>  getUserOrderById(@PathVariable("id") int id) {
        log.info("get user order");
        System.out.println("LLLLLLLLLL ");
        List<Order>  orders = customerService.getCustomerOrder(id);
        return orders;
    }

    
    @GetMapping("/user/{id}/orders/{orderId}")
    public  List<Item>  getUserParticularOrderById(@PathVariable("id") int id, @PathVariable("orderId") int orderId) {
        log.info("get user particular order");
        System.out.println("LLLLLLLLLL ");
        List<Item> items = customerService.getCustomerParticularOrder(id, orderId);
        return items;
    }



}
