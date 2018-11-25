package com.cmdb.task;

import org.springframework.web.bind.annotation.RestController;

import com.cmdb.stub.task.ExecutorService;

@RestController
public class Executor2Controller implements ExecutorService {

	@Override
	public String selectById(String id) {
		return "this is task.selectById";
	}

}
