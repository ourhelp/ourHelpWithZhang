package cn.cdtu.CDTUE.service;

import java.util.List;

import cn.cdtu.CDTUE.pojo.School;
import cn.cdtu.CDTUE.pojo.SchoolWithBLOBs;

public interface SchoolService {

	List<School> list();

	String selectNameById(String schoolid);

	void add(SchoolWithBLOBs school);


}
