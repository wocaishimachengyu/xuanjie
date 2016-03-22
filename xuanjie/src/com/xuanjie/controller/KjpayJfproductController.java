package com.xuanjie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xuanjie.po.KjpayJfproduct;
import com.xuanjie.service.KjpayJfproductService;
@Controller
public class KjpayJfproductController {
	@Autowired
	private KjpayJfproductService kjpayjfproductservice;
	@Autowired
	private KjpayJfproduct kjpayjfproduct;
	@RequestMapping(value="/kjpay.action",produces={"text/html;charset=UTF-8"})
	public @ResponseBody String find(String productid){
		kjpayjfproduct.setProductid(productid);
		try {
			kjpayjfproduct=kjpayjfproductservice.find(kjpayjfproduct);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return kjpayjfproduct.getDiqu();
	}
}
