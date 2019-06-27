package cn.cdtu.CDTUE.service;

import java.util.List;

import cn.cdtu.CDTUE.pojo.User;

public interface UserService {

	String login(User user);

	List<User> list();

	void regist(User user);


}
