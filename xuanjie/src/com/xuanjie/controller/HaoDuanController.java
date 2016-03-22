package com.xuanjie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xuanjie.po.HaoDuan;
import com.xuanjie.service.HaoDuanService;
@Controller
public class HaoDuanController {
	@Autowired
	private HaoDuanService haoduanservice;
	@Autowired
	private HaoDuan haoduan;
	@RequestMapping("/haoduan.action")
	public @ResponseBody String find(String phone){
		haoduan.setTelepcode(phone);
		try {
			haoduan = haoduanservice.find(haoduan);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return haoduan.getAreaname();
	}
}
