package com.cmdb.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cmdb.stub.task.ExecutorService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api(tags="登陆")
@RestController
public class UserController  {
	@Autowired
    private ExecutorService executorService;
	@RequestMapping(value="login",method=RequestMethod.POST)
	@ApiOperation("登陆")
	public String selectById() {
		return executorService.selectById("123");
	}

}
