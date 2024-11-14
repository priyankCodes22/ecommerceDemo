package com.cartdb.cart_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CartServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(CartServiceApplication.class, args);
		System.out.println("cart service started");
	}

}
