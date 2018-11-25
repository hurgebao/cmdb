package com.cmdb.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class CmdbEurekaApplication {
	public static void main(String[] args) {
		SpringApplication.run(CmdbEurekaApplication.class, args);
	}
}
