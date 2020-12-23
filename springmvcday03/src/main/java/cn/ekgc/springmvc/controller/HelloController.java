package cn.ekgc.springmvc.controller;


import cn.ekgc.springmvc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller("helloController")
@RequestMapping("/hello")
public class HelloController {
	@Autowired
	private HttpServletRequest request;
	@Autowired
	private HttpServletResponse response;
	@Autowired
	private HttpSession session;
	// 获得请求

	// @RequestMapping 可以接受get和post请求
	@RequestMapping(value = "/say")
	public String sayHello(){
		System.out.println("进入sayHello()方法");
		return "hello";
	}

	@RequestMapping(value="/testget",method = RequestMethod.GET)
	public String testGet(){
		System.out.println("处理get请求");
		return "hello";
	}

	@GetMapping("/testget1")
	public String testGet1(){
		System.out.println("处理get请求第二种");
		return "hello";
	}
	// 页面默认get请求
	@RequestMapping(value="/testpost",method = RequestMethod.POST)
	public String testPost(){
		System.out.println("处理post请求");
		return "hello";
	}
	@PostMapping("/testpost1")
	public String testPost1(){
		System.out.println("处理post请求1");
		return "hello";
	}

	// 获得请求的参数
	@GetMapping("/param")
	public String getParam(HttpServletRequest request, HttpServletResponse response){
		String name = request.getParameter("name");
		String cellphone = request.getParameter("cellphone");
		System.out.println("姓名：" + name + "\t" + "手机号：" + cellphone);
		return "hello";
	}

	@GetMapping("/param1")
	public String getParam1(){
		String name = request.getParameter("name");
		String cellphone = request.getParameter("cellphone");
		System.out.println("姓名：" + name + "\t" + "手机号：" + cellphone);
		return "hello";
	}

	@GetMapping("/param2")
	public String getParam2(String name,String cellphone,Integer age){
		System.out.println("姓名：" + name + "\t" + "手机号：" + cellphone + "\t" + "age：" + age);
		return "hello";
	}

	@GetMapping("/param3")
	public String getParam3(User user, Integer age){
		System.out.println("姓名：" + user.getName() + "\t" + "手机号：" + user.getCellphone() + "\t" + "age：" + age);
		return "hello";
	}

	// 转发和重定向
	@GetMapping("/forward")
	public ModelAndView forward(){
		// 使用modemap对象完成转发 ，该对象和map集合一样
		ModelMap map = new ModelMap();
		map.put("name","MVC");
		return new ModelAndView("hello",map);
	}

	@GetMapping("/forward1")
	public ModelAndView forward1() {
		// 使用modemap对象完成转发 ，该对象和map集合一样
		return new ModelAndView("hello", "name", "MVC");
	}

	@GetMapping("/forward2")
	public String forward2(ModelMap map){
		map.put("name","MVC");
		map.put("cellphone","12357912368");
		return  "hello";
	}
	@GetMapping("/forward3")
	public String forward3(ModelMap map){
		map.put("name","12");
		map.put("cellphone","1245");
		return  "hello";
	}
	// 重定向
	@GetMapping("/redirect1")
	public ModelAndView sendRedirect1(){
		RedirectView view = new RedirectView("say");
		return new ModelAndView(view);
	}

	@GetMapping("/redirect3")
	public ModelAndView sendRedirect3(){
		RedirectView view = new RedirectView("say");
		return  new ModelAndView(view);
	}
}
