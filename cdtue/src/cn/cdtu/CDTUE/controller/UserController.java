package cn.cdtu.CDTUE.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.cdtu.CDTUE.pojo.Page;
import cn.cdtu.CDTUE.pojo.School;
import cn.cdtu.CDTUE.pojo.User;
import cn.cdtu.CDTUE.service.SchoolService;
import cn.cdtu.CDTUE.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private SchoolService schoolService;
	
	@ResponseBody
	@RequestMapping("/login")
	public String login(User user) {
		String result = userService.login(user);
		return result;
	}
	
	@RequestMapping("list")
	public String list(Model model, Page page) {
		
		//[index=1,sum=5,totalPage=null,count=7]
		
		// 根据页码获取所有的用户集合
		List<User> list = userService.list(page);
		
		// 查询总共的数据条数
		Integer count = userService.selectCount();
		
		page.setCount(count);
		
		model.addAttribute("users", list);
		model.addAttribute("page", page);
		return "../User/index";
	}
	
	@RequestMapping("toadd")
	public String toadd(Model model) {
		// 查询所有的学校
		List<School> list = schoolService.list();
		
		model.addAttribute("schools", list);
		
		return "../User/add";
	}
	
	@RequestMapping("add")
	public String add(User user) {
		// 把获取到的用户数据，写入数据库
		userService.regist(user);
		
		return "forward:list";
	}
	
	@RequestMapping("test")
	public void test(User user) {
		System.out.println(user);
	}
}
