package com.xuanjie.mapper;

import com.xuanjie.po.XjUser;

public interface XjUserMapper {
	public XjUser findbyaccount(String account) throws Exception;
}
