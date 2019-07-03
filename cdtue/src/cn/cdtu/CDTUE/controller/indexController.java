package cn.cdtu.CDTUE.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.cdtu.CDTUE.pojo.User;

@Controller
public class indexController {
	@RequestMapping("index")
	public String index(Model model){
		
	
		
		return "index";
	}
}
