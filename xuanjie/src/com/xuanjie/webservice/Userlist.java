package com.xuanjie.webservice;

import javax.xml.ws.Holder;

import org.springframework.beans.factory.annotation.Autowired;

import com.xuanjie.po.XjUser;
import com.xuanjie.service.XjUserService;
import com.xuanjie.util.CheckMessage;


public class Userlist implements IUserList {
	@Autowired
	private XjUserService xjuserservice;
	@Override
	public String login(String account, String strmd5, String tokencontent,
			String sign) {
		// TODO Auto-generated method stub
//		if (CheckMessage.check((account + strmd5 + tokencontent + "general"),
//				sign)) {
			XjUser xjuser = null;
			try {
				xjuser = xjuserservice.findbyaccount(account);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String pass=xjuser.getUsername();
//		}
		return pass;
	}

	@Override
	public String zhuce(String account, String password, String username,
			String identityid, String paypassword, String shopname,
			String telephone, String address, String mgr, String sign) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String mergepass(String userno, String oldpassword,
			String newpassword, String sign) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String mergeuser(String userno, String telephone, String address,
			String username, String shopname, String sign) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String showuser(String userno, String sign) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String mergepaypass(String userno, String oldpaypass,
			String newpaypass, String sign) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addmoneyforbank(String userno, String amount, String remark,
			String sign) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getaddmoneylist(String userno, long begin, long end,
			int state, String sign) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getfinancelist(String userno, long begin, long end,
			String sign) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String gethunobalance(String huno, String sign) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String forgeturl(String userno, String price, String desc,
			String attach, String sign) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addmoneyforgeturl(String userno, String price, String desc,
			String attach, String sign) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String forwxurl(String userno, String price, String desc,
			String attach, String sign) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String forwxappinfo(String userno, String price, String desc,
			String attach, String sign) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getqrcodeorderlist(String userno, long timestart,
			long timeend, int billstage, int ordermode, String spbillno,
			String sign) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Qqpay(String userno, String price, String desc,
			String attach, String authcode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String WXpay(String userno, String price, String desc,
			String attach, String authcode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addmanager(String account, String password, String sign) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String managerlogin(String account, String strmd5, String sign) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String mergemanagerpass(String managerno, String strmd5,
			String newpass, String sign) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String adduserlevel(String managerno, String levelname, String sign) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String mergeuserlevelinfo(String managerno, String levelno,
			String levelname, String sign) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getuserlevellist(String managerno, String sign, int pagesize,
			int page, Holder<Integer> h) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String mergeuserlevel(String managerno, String userno,
			String levelno, String sign) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getuseralllist(String managerno, int userstate,
			String userno, String shopname, String username, String sign,
			int pagesize, int page, Holder<Integer> h) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String mergexjuserstate(String managerno, String userno,
			int userstate, String sign) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String resetuserpass(String managerno, String userno, String sign) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String mergesysinfo(boolean b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getaddmoneyalllist(String managerno, String userno,
			long timestart, long timeend, int state, String sign, int pagesize,
			int page, Holder<Integer> h) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addmoneyformanager(String managerno, String userno,
			double amount, String remark, String sign) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String mergeaddmoneyforbank(String managerno, String addmoneyno,
			int state, String sign) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getqrcodeorderalllist(String managerno, String xjuserno,
			long timestart, long timeend, int billstage, int ordermode,
			String spbillno, String sign, int pagesize, int page,
			Holder<Integer> h) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getuserlogalllist(String managerno, String userno,
			long timestart, long timeend, String sign, int pagesize, int page,
			Holder<Integer> h) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getmanagerlogalllist(String managerno, long timestart,
			long timeend, String sign, int pagesize, int page, Holder<Integer> h) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getmessage(String managerno, String sign) {
		// TODO Auto-generated method stub
		return null;
	}

}
