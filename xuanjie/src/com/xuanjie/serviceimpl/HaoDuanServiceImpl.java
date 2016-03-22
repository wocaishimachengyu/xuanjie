package com.xuanjie.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.xuanjie.mapper.HaoDuanMapper;
import com.xuanjie.po.HaoDuan;
import com.xuanjie.service.HaoDuanService;

public class HaoDuanServiceImpl implements HaoDuanService {
	@Autowired
	private HaoDuanMapper haoduanmapper;
	@Override
	public HaoDuan find(HaoDuan haoduan) throws Exception {
		// TODO Auto-generated method stub
		return haoduanmapper.find(haoduan);
	}

}
