package org.gotomoon.service.web;

import org.gotomoon.client.request.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserServiceImpl implements UserService {

	@Override
	@RequestMapping("/login")
	@ResponseBody
	public String login() {
		return "login";
	}

}
