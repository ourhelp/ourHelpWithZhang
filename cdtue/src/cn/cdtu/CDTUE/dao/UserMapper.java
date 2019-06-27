package cn.cdtu.CDTUE.dao;

import java.util.List;

import cn.cdtu.CDTUE.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	User selectByPrimaryUsername(String username);

	User selectByUsername(String username);

	List<User> selectAll();

}