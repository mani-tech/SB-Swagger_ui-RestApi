package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbSwaggerUiRestApiApplication {
	public static final String PAYMENT_URL="http://localhost:8080/emp"; 
public static void main(String[] args) {
System.out.println("hello featre-201");
SpringApplication.run(SbSwaggerUiRestApiApplication.class, args);
	}

}
