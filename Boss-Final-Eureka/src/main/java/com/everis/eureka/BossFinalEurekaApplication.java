package com.everis.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BossFinalEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BossFinalEurekaApplication.class, args);
	}

}
