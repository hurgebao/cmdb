package com.cmdb.web.feign;

public class HystrixClientFallBack implements ExecutorFeignClient {

	@Override
	public String hello() {
		return "hello hystrixClientFallBack";
	}

}
