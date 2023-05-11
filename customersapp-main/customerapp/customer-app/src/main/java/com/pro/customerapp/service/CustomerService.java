package com.pro.customerapp.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro.customerapp.model.Customer;
import com.pro.customerapp.model.CustomerData;
import com.pro.customerapp.model.Item;
import com.pro.customerapp.model.Order;
import com.pro.customerapp.util.DataLoad;

@Service
public class CustomerService {
    
    @Autowired
    DataLoad dataLoad;
    List<Customer> customers = new ArrayList<>();
     
    public  List<CustomerData> getCustomersData(){
        List<CustomerData> data =  dataLoad.getCustomerData();
        return data;
    }


    
    public CustomerData getCustomer(int id) {
    List<CustomerData> data =  dataLoad.getCustomerData();
    CustomerData customerData = data.stream().filter(obj -> obj.getId() == id).findFirst().orElse(new CustomerData());
  
    return customerData;
   
       }

       public List<Order> getCustomerOrder(int id) {

        List<CustomerData> data =  dataLoad.getCustomerData();
        CustomerData customerData = data.stream().filter(obj -> obj.getId() == id).findFirst().orElse(new CustomerData());
        return customerData.getOrders();
   
       }

       public List<Item> getCustomerParticularOrder(int id, int orderId) {

        List<CustomerData> data =  dataLoad.getCustomerData();
        CustomerData customerData = data.stream().filter(obj -> obj.getId() == id).findFirst().orElse(new CustomerData());
        List<Order> orders = customerData.getOrders();
        Order order = orders.stream().filter(obj -> obj.getId() == orderId).findFirst().orElse(new Order());
        return order.getItems();
   
       }



}
