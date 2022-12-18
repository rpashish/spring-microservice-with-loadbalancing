package com.ashish.sprint.tutorials.naming.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/*** Spring Eureka Server ***/
@SpringBootApplication
@EnableEurekaServer
public class ForexServiceNamingEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForexServiceNamingEurekaServerApplication.class, args);
	}

}
