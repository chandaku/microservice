package com.eureka.netflix.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaNetflixRegistryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaNetflixRegistryServerApplication.class, args);
	}
}
