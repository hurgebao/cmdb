package com.cmdb.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cmdb.stub.task.ExecutorService;
@RestController
public class Test2Controller  {
	@Reference
    private ExecutorService executorService;
	@GetMapping("selectById")
	public String selectById() {
		return executorService.selectById("123");
	}

}
