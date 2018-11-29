package com.cmdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableZipkinServer
public class ZipKinApplication {
	public static void main(String[] args) {
		args = new String[1];
	    args[0] = "--spring.profiles.active=zipkin-http";
		SpringApplication.run(ZipKinApplication.class, args);
	}
}
