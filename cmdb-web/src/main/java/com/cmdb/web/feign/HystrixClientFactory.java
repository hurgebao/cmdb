package com.cmdb.web.feign;

import feign.hystrix.FallbackFactory;

public class HystrixClientFactory implements FallbackFactory<ExecutorFeignClient> {

	@Override
	public ExecutorFeignClient create(Throwable cause) {
		return new ExecutorFeignClientWithFactory() {
			@Override
			public String hello() {
				return "hello 123";
			}
		};
	}

}
