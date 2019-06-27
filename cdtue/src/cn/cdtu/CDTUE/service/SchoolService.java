package cn.cdtu.CDTUE.service;

import java.util.List;

import cn.cdtu.CDTUE.pojo.School;

public interface SchoolService {

	List<School> list();

	String selectNameById(String schoolid);


}
