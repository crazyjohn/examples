package com.dubbo.provider;

import com.dubbo.service.DemoService;

public class DemoServiceImpl implements DemoService {

	@Override
	public String sayHello(String name) {
		String result = "Hello: " + name;
		System.out.println(result);
		return result;
	}

}
