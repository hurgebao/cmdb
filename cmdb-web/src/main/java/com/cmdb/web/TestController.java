package com.cmdb.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cmdb.web.feign.ExecutorFeignClient;
import com.cmdb.web.mapper.RoleMapper;

@RestController
public class TestController {
	@Autowired
	private ExecutorFeignClient executorFeignClient;
	@Autowired
	private RoleMapper roleMapper;
	@GetMapping("hello")
	public String hello() {
		return executorFeignClient.hello();
	}
	@GetMapping("mysql")
	public String mysql() {
		return roleMapper.selectByPrimaryKey(1).getRoleName();
	}
}
