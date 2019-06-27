package cn.cdtu.CDTUE.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.cdtu.CDTUE.dao.UserMapper;
import cn.cdtu.CDTUE.pojo.User;
import cn.cdtu.CDTUE.service.UserService;
import cn.cdtu.CDTUE.util.Tools;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	@Override
	public String login(User user) {
		
		// �������
		user.setPassword(Tools.md5(user.getPassword()));
		
		// �����û��������û�
		User u = userMapper.selectByUsername(user.getUsername());
		
		// ��� uΪ��
		if(u == null) return "username not found";
		
		// u ��Ϊ��
		if(u.getPassword().equals(user.getPassword())) 
			return "success"; 
		else 
			return "password is error";
		
	}
	@Override
	public String regist(User user) {
		userMapper.insertSelective(user);
		return "ע��ɹ�";
	}

}
