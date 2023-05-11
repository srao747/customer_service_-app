package com.pro.customerapp.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.List;

import com.pro.customerapp.model.Customer;
import com.pro.customerapp.model.CustomerData;

@Service
public class DataLoad {
    List<CustomerData> customerDatas;

    List<Customer> customersDatas;


    public  List<CustomerData> getCustomerData(){
        return customerDatas;
    }

    public  List<Customer> getCustomersData(){
        return customersDatas;
    }
    

public void loadData() throws IOException {
     
 
         
        ObjectMapper objectMapper = new ObjectMapper();

String fileName = "src/main/resources/data.json";

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        StringBuilder stringBuilder = new StringBuilder();
        String line = null;
        
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
        }
        
        reader.close();
        String jsonArray = stringBuilder.toString();
    
       customerDatas = objectMapper.readValue(jsonArray, new TypeReference<List<CustomerData>>() {});
    
        System.out.println("Customers Data "+customerDatas);
       
    }

    // public void loadCustomerData() throws IOException {
       
    //     ObjectMapper objectMapper = new ObjectMapper();
    //     String fileName = "src/main/resources/customer.json";
    //     BufferedReader reader = new BufferedReader(new FileReader(fileName));
    //     StringBuilder stringBuilder = new StringBuilder();
    //     String line = null;  
    //     while ((line = reader.readLine()) != null) {
    //         stringBuilder.append(line);
    //     } 
    //     reader.close();
    //     String jsonArray = stringBuilder.toString();
    //    customersDatas = objectMapper.readValue(jsonArray, new TypeReference<List<Customer>>() {});
    //    System.out.println("Customers Data "+customersDatas);
       
    // }


}
