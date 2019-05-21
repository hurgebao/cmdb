package com.cmdb.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {
	public  String username;
	
	public  String password;

	public  String getUsername() {
		return username;
	}
	@Value("${test.username}")
	public  void setUsername(String username) {
		this.username = username;
	}

	public  String getPassword() {
		return password;
	}
	@Value("${test.password}")
	public  void setPassword(String password) {
		this.password = password;
	}
	
	
}
