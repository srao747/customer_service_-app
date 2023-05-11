package com.pro.customerapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Item {
   
    private String product;
    private int quantity;
    private double price;
    private String paymentMethod;
    private String tax;
    private String discount;
    private String invoiceNumber;

}
