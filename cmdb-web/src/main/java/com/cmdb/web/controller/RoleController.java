package com.cmdb.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cmdb.web.feign.ExecutorFeignClient;
import com.cmdb.web.mapper.RoleMapper;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags="角色管理")
@RestController
@RequestMapping("role")
public class RoleController {
	@Autowired
	private ExecutorFeignClient executorFeignClient;
	@Autowired
	private RoleMapper roleMapper;
	@GetMapping("hello")
	@ApiOperation("测试")
	public String hello() {
		return executorFeignClient.hello();
	}
	@GetMapping("selectById/{id}")
	@ApiOperation("按id查询")
	public String mysql(@PathVariable("id")Integer id) {
		return roleMapper.selectByPrimaryKey(id).getRoleName();
	}
}
