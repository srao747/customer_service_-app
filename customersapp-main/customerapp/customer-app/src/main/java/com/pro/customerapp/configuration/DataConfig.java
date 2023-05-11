package com.pro.customerapp.configuration;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pro.customerapp.model.CustomerData;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

@Configuration
public class DataConfig {
    
    // @Value("classpath:data.json")
    // private InputStream dataJson;


    // @Bean
    // public List<CustomerData> customers() throws IOException {
    //     ObjectMapper mapper = new ObjectMapper();
    //     TypeReference<List<CustomerData>> typeReference = new TypeReference<List<CustomerData>>() {};
    //     List<CustomerData> customers = mapper.readValue(dataJson, typeReference);
    //     return customers;
    // }
}



