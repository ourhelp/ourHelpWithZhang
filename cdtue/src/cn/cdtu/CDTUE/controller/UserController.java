package cn.cdtu.CDTUE.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	public String list(Model model) {
		
		// ��ȡ���е��û�����
		List<User> list = userService.list();
		
		model.addAttribute("users", list);
		
		return "../User/index";
	}
	
	@RequestMapping("toadd")
	public String toadd(Model model) {
		// ��ѯ���е�ѧУ
		List<School> list = schoolService.list();
		
		model.addAttribute("schools", list);
		
		return "../User/add";
	}
	
	@RequestMapping("add")
	public String add(User user) {
		// �ѻ�ȡ�����û����ݣ�д�����ݿ�
		userService.regist(user);
		
		return "forward:list";
	}
}
