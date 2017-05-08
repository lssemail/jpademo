package com.demo.web.controller;

import com.demo.common.entity.User;
import com.demo.common.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class IndexController {

	@Autowired
	UserService service;

	@RequestMapping("/index")
	public String index(Map<String, Object> model) {
		List<User> users = service.find();
		model.put("users", users);
		model.put("name", "小荟");
		return "index";
	}

	@RequestMapping("/users")
	@ResponseBody
	public List<User> users() {
		return service.find();
	}

	@RequestMapping("/user/{name}")
	@ResponseBody
	public User users(@PathVariable String name) {
		return service.findByName(name);
	}


}
