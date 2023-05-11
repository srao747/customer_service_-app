package com.pro.customerapp.model;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CustomerData {
    private int id;
    private String name;
    private String email;
    private String number;
    private String address;
    private int age;
     private List<Order> orders;
}
