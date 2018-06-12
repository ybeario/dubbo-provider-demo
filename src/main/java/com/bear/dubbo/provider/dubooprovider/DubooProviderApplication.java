package com.bear.dubbo.provider.dubooprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:providers.xml"}) // 使用 providers.xml 配置
public class DubooProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubooProviderApplication.class, args);
	}
}
