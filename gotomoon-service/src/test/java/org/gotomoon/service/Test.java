package org.gotomoon.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "org.gotomoon.service.web")
@EnableAutoConfiguration
public class Test {
	public static void main(String[] args) throws Exception {
        SpringApplication.run(Test.class, args);
    }	
}
