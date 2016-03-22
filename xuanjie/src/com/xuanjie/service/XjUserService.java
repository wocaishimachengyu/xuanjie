package com.xuanjie.service;

import com.xuanjie.po.XjUser;

public interface XjUserService {
	public XjUser findbyaccount(String account) throws Exception;
}
