package cn.cdtu.CDTUE.service;

import java.util.List;

import cn.cdtu.CDTUE.pojo.Page;
import cn.cdtu.CDTUE.pojo.User;

public interface UserService {

	String login(User user);

	List<User> list(Page page);

	void regist(User user);

	Integer selectCount();


}
