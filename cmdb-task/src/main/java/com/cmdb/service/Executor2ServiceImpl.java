package com.cmdb.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.cmdb.stub.task.ExecutorService;

@Service
public class Executor2ServiceImpl implements ExecutorService {

	@Override
	public String selectById(String id) {
		return "this is task.selectById";
	}

}
