package com.cmdb.web.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="cmdb-task"/*,fallbackFactory=HystrixClientFactory.class*/)
public interface ExecutorFeignClient {
	@RequestMapping(value="hello",method=RequestMethod.GET)
	public String hello();
}
