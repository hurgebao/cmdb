package com.cmdb.task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags="测试本地调用")
public class ExecutorController {
	@Autowired
	private EurekaClient eurekaClient;

	@GetMapping("hello")
	@ApiOperation("hello")
	public String hello() {
		return "hello ,this is task";
	}

	@GetMapping("/eureka-instance")
	public String serviceUrl() {
		InstanceInfo instance = this.eurekaClient.getNextServerFromEureka("CMDB-TASK", false);
		return instance.getHomePageUrl();
	}

}
