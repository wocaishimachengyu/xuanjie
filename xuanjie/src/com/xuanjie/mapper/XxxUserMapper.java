package com.xuanjie.mapper;

import com.xuanjie.po.XxxUser;

public interface XxxUserMapper {
	public XxxUser find(XxxUser user) throws Exception;
	public int add(XxxUser user) throws Exception;
}
