package com.isaachambers.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class DemoProxyServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoProxyServerApplication.class, args);
	}
}
