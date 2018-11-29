package com.cmdb.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cmdb.stub.task.ExecutorService;
@RestController
public class Test2Controller  {
	@Autowired
    private ExecutorService executorService;
	@RequestMapping(value="selectById",method=RequestMethod.POST)
	public String selectById() {
		return executorService.selectById("123");
	}

}
