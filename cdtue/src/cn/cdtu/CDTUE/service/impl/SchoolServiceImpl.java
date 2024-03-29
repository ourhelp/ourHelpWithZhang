package cn.cdtu.CDTUE.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.cdtu.CDTUE.dao.SchoolMapper;
import cn.cdtu.CDTUE.pojo.School;
import cn.cdtu.CDTUE.pojo.SchoolWithBLOBs;
import cn.cdtu.CDTUE.service.SchoolService;
import cn.cdtu.CDTUE.util.Tools;

@Service
public class SchoolServiceImpl implements SchoolService {

	@Autowired
	private SchoolMapper schoolMapper;
	
	
	@Override
	public List<School> list() {
		List<School> list = schoolMapper.selectAll();
		return list;
	}


	@Override
	public String selectNameById(String schoolid) {
		String schoolname = schoolMapper.selectNameById(schoolid);
		return schoolname;
	}


	@Override
	public void add(SchoolWithBLOBs school) {
		
		school.setId(Tools.getId());
		
		schoolMapper.insertSelective(school);
		
	}


}
