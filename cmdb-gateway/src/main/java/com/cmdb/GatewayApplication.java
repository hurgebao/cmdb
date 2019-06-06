package com.cmdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class GatewayApplication {
	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
//	@Bean
//    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
//       return builder.routes()
//        .route(p -> p
//            .path("/hello")
//            .filters(f -> f.addRequestHeader("Hello", "World"))
//            .uri("http://10.1.35.15:8081"))
//        .build();
//    }
}
