package com.mutualser.delegate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DelegateApplication {

	public static void main(String[] args) {
		SpringApplication.run(DelegateApplication.class, args);
	}

}
