package com.pro.customerapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Customer {
    private int id;
    private String name;
    private String email;
    private String number;
    private String address;
    private int age;

}
