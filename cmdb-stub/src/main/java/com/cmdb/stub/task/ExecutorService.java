package com.cmdb.stub.task;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="cmdb-task")
public interface ExecutorService {
	@RequestMapping(value="selectById",method=RequestMethod.POST)
	String selectById(String id);
}
