package cn.ekgc.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("helloController")
public class HelloController {

	@RequestMapping(value = "/say/")
	public String sayHello(){
		System.out.println("第一次试验");
		return "hello";
	}
}
