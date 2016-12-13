package com.guide.ssm.module.user.service.impl;

import com.guide.ssm.module.user.mapper.TbVisitorMapper;
import com.guide.ssm.module.user.pojo.TbVisitor;
import com.guide.ssm.module.user.service.VisitorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class VisitorServiceImpl implements VisitorService{
	
	@Resource
	private TbVisitorMapper tbVisitorMapper;


	@Override
	public TbVisitor getById(String id) {
		System.out.println("SysUserServiceImpl");
		return tbVisitorMapper.selectByPrimaryKey(id);
	}
}
