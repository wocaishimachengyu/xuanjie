package com.xuanjie.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.xuanjie.mapper.XjUserMapper;
import com.xuanjie.po.XjUser;
import com.xuanjie.service.XjUserService;

public class XjUserServiceImpl implements XjUserService {
	@Autowired
	private XjUserMapper xjusermapper;
	@Override
	public XjUser findbyaccount(String account) throws Exception {
		// TODO Auto-generated method stub
		return xjusermapper.findbyaccount(account);
	}

}
