package com.everis.quotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class BossFinalQuotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BossFinalQuotationApplication.class, args);
	}

}
