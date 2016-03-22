package com.xuanjie.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xuanjie.po.XxxUser;
import com.xuanjie.service.XxxUserService;

@Controller
public class XxxUserController {
	@Autowired
	private XxxUserService xxxuserservice;
	@Autowired
	private XxxUser xxxuser;
	@RequestMapping(value="/findxxxuser.action",produces={"text/html;charset=UTF-8"})
	public @ResponseBody String find(String name){
		xxxuser.setName(name);
		try {
			xxxuser=xxxuserservice.find(xxxuser);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return xxxuser.getLevelno().toString();
	}
	@RequestMapping(value="/add.action")
	public @ResponseBody int add(String name,String levelno,String age){
		xxxuser.setName(name);
		xxxuser.setLevelno(levelno);
		xxxuser.setCreatetime(new Date());
		xxxuser.setAge(Integer.valueOf(age));
		try {
			return xxxuserservice.add(xxxuser);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
}	
