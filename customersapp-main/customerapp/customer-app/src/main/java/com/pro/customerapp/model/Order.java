package com.pro.customerapp.model;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Order {
    
    private int id;
    private String date;
    private List<Item> items;
    private double total;
    
}
