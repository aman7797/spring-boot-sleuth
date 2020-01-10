package com.example.mall;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MallApplication {

	public static void main(String[] args) {
		Logger LOGGER = LoggerFactory.getLogger(MallApplication.class);
		LOGGER.info("Mall Class Invoked");
		SpringApplication.run(MallApplication.class, args);
	}

}
