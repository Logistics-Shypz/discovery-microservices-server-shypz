package com.shypz.shypzdiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class DiscoveryMicroservicesServerShypzApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryMicroservicesServerShypzApplication.class, args);
	}
}
