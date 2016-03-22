package com.xuanjie.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.xuanjie.mapper.KjpayJfproductMapper;
import com.xuanjie.po.KjpayJfproduct;
import com.xuanjie.service.KjpayJfproductService;

public class KjpayJfproductServiceImpl implements KjpayJfproductService {
	@Autowired
	private KjpayJfproductMapper kjpayjfproductmapper;
	@Override
	public KjpayJfproduct find(KjpayJfproduct kjpayjfproduct) throws Exception {
		// TODO Auto-generated method stub
		return kjpayjfproductmapper.find(kjpayjfproduct);
	}

}
