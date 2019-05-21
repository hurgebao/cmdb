package com.cmdb.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cmdb.conf.TestConfig;
@RestController
public class TestController {
	@Autowired
	private TestConfig testConfig;
	
	@RequestMapping(name="test")
	@ResponseBody
    public String test() {
        return testConfig.username;
    }
}
