package com.zwd.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

	
	@RequestMapping("hello")
	@ResponseBody
	public String hello() {
		System.out.println(11);
		return "Hello Spring Cloud";
	}
}
