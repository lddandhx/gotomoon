package org.gotomoon.service.web;

import org.gotomoon.client.request.HelloService;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Configuration
@Controller
public class HelloServiceImpl implements HelloService{
	@RequestMapping("/hello")
    @ResponseBody
	public String hello() {
		return "hello";
	}
}
	