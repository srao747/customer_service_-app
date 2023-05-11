package com.pro.customerapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pro.customerapp.model.CustomerData;
import com.pro.customerapp.service.CustomerService;
import com.pro.customerapp.util.DataLoad;

@SpringBootApplication
public class CustomerAppApplication implements CommandLineRunner {

	@Autowired
	DataLoad dataLoad;
	@Autowired
	CustomerService customerService;

	public static void main(String[] args) {
		SpringApplication.run(CustomerAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		dataLoad.loadData();
		// dataLoad.loadCustomerData();
		System.out.println("Spring Boot application started!");
	}

}
