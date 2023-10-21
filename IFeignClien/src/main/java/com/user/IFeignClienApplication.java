package com.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients

public class IFeignClienApplication {

	public static void main(String[] args) {
		SpringApplication.run(IFeignClienApplication.class, args);
	}

}
