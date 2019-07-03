package cn.cdtu.CDTUE.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.cdtu.CDTUE.pojo.SchoolWithBLOBs;
import cn.cdtu.CDTUE.service.SchoolService;

@Controller
@RequestMapping("/school")
public class SchoolController {

	@Autowired
	private SchoolService schoolService;
	
	@RequestMapping("add")
	public String add(SchoolWithBLOBs school) {
		
		schoolService.add(school);
		
		
		return "../School/index";
	}
	
	
	
}
