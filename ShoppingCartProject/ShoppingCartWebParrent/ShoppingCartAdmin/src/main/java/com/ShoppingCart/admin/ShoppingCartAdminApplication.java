package com.ShoppingCart.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.ShoppingCart.common.entity"})
public class ShoppingCartAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartAdminApplication.class, args);
	}

}
