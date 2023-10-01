package com.pksoftware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;



@EnableEurekaServer
@EnableFeignClients
@SpringBootApplication
public class ManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagerApplication.class, args);
		System.out.println("Spring Boot Starter**************manager********************");
	}
	
	@Bean
	public RestTemplate getRestTemplate() {
		
		  return new RestTemplate();
	}

}
