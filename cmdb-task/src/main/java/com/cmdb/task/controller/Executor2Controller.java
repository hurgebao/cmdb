package com.cmdb.task.controller;

import org.springframework.web.bind.annotation.RestController;

import com.cmdb.stub.task.ExecutorService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags="测试远程调用")
public class Executor2Controller implements ExecutorService {

	@Override
	@ApiOperation("selectById")
	public String selectById(String id) {
		return "this is task.selectById";
	}

}
