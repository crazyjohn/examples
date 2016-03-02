package com.dubbo.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbo.service.DemoService;

public class ConsumerApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "consumer.xml" });
		context.start();
		// 获取远程服务代理
		DemoService demoService = (DemoService) context.getBean("demoService");
		int callTimes = 10;
		for (int i = 0; i <= callTimes; i++) {
			// 显示调用结果
			System.out.println(demoService.sayHello("world" + i));
		}
		context.close();
	}
}
