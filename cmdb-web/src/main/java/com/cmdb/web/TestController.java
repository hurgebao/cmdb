package com.cmdb.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cmdb.web.feign.ExecutorFeignClient;

@RestController
public class TestController {
	@Autowired
	private ExecutorFeignClient executorFeignClient;
	@GetMapping("hello")
	public String hello() {
		return executorFeignClient.hello();
	}
}
