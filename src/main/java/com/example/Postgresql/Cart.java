package com.example.Postgresql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@ComponentScan
@SpringBootApplication
@EnableFeignClients
public class Cart {

	public static void main(String[] args) {
		SpringApplication.run(Cart.class,args);
	}

}
