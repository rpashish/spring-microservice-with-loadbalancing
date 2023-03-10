package com.ashish.sprint.tutorials.forex.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.ashish.sprint.tutorials.forex.entity"})
@EnableJpaRepositories(basePackages = {"com.ashish.sprint.tutorials.forex.repo"})
@ComponentScan(basePackages = {"com.ashish.sprint.tutorials.forex.controller"})
public class ForexServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForexServiceApplication.class, args);
	}

}
