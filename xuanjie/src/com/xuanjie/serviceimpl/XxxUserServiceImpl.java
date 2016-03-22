package com.xuanjie.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.xuanjie.mapper.XxxUserMapper;
import com.xuanjie.po.XxxUser;
import com.xuanjie.service.XxxUserService;

public class XxxUserServiceImpl implements XxxUserService {
	@Autowired
	private XxxUserMapper xxxusermapper;
	@Override
	public XxxUser find(XxxUser user) throws Exception {
		// TODO Auto-generated method stub
		return xxxusermapper.find(user);
	}

	@Override
	public int add(XxxUser user) throws Exception {
		// TODO Auto-generated method stub
		return xxxusermapper.add(user);
	}

}
