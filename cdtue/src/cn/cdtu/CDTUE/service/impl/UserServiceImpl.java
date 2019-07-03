package cn.cdtu.CDTUE.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.cdtu.CDTUE.dao.UserMapper;
import cn.cdtu.CDTUE.pojo.Page;
import cn.cdtu.CDTUE.pojo.User;
import cn.cdtu.CDTUE.service.SchoolService;
import cn.cdtu.CDTUE.service.UserService;
import cn.cdtu.CDTUE.util.Tools;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private SchoolService schoolService;
	
	@Override
	public String login(User user) {
		
		// 密码加密
		user.setPassword(Tools.md5(user.getPassword()));
		
		// 根据用户名查找用户
		User u = userMapper.selectByUsername(user.getUsername());
		
		// 如果 u为空
		if(u == null) return "username not found";
		
		// u 不为空
		if(u.getPassword().equals(user.getPassword())) 
			return "success"; 
		else 
			return "password is error";
		
	}


	@Override
	public List<User> list(Page page) {
		
		List<User> list = userMapper.selectAllByPage(page);
		
		return list;
	}


	@Override
	public void regist(User user) {
		
		user.setId(Tools.getId());
		user.setCreatetime(Tools.getTime());
		user.setPassword(Tools.md5(user.getPassword()));
		
		// 根据所属学校id，查询学校名称
		String schoolname = schoolService.selectNameById(user.getSchoolid());
		user.setSchoolname(schoolname);
		
		
		userMapper.insertSelective(user);
		
	}


	@Override
	public Integer selectCount() {
		Integer count = userMapper.selectCount();
		return count;
	}

}
