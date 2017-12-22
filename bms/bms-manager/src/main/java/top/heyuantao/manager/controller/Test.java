package top.heyuantao.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import top.heyuantao.manager.pojo.User;
import top.heyuantao.manager.service.UserService;

@Controller
public class Test {
	@Autowired
	private UserService userService;
	
	@RequestMapping("testjsp")
	public void testjsp() {
		System.out.println("成功");
		int s=userService.addUser(new User(15,"wanwu","123456","12345678910","上海"));
		System.out.println(s);
	}
	
}
