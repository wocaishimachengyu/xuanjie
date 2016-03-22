package com.xuanjie.service;

import com.xuanjie.po.XxxUser;

public interface XxxUserService {
	public XxxUser find(XxxUser user) throws Exception;
	public int add(XxxUser user) throws Exception;
}
