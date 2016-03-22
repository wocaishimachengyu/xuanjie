package com.xuanjie.webservice;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.Holder;

@WebService
public interface IUserList {
	// 用户登录
	public String login(String account, String strmd5, String tokencontent,
			String sign);

	// 用户注册
	public String zhuce(String account, String password, String username,
			String identityid, String paypassword, String shopname,
			String telephone, String address, String mgr, String sign);

	// 修改密码
	public String mergepass(String userno, String oldpassword,
			String newpassword, String sign);

	// 修改用户信息
	public String mergeuser(String userno, String telephone, String address,
			String username, String shopname, String sign);

	// 展示用户信息
	public String showuser(String userno, String sign);

	// 修改支付密码
	public String mergepaypass(String userno, String oldpaypass,
			String newpaypass, String sign);

	// 用户储值(银行汇款)
	public String addmoneyforbank(String userno, String amount, String remark,
			String sign);

	// 展示储值记录
	public String getaddmoneylist(String userno, long begin, long end,
			int state, String sign);

	// 展示账户明细
	public String getfinancelist(String userno, long begin, long end,
			String sign);

	// 查询用户户号余额
	public String gethunobalance(String huno, String sign);

	// 手Q生成二维码
	public String forgeturl(String userno, String price, String desc,
			String attach, String sign);

	// 手Q生成二维码收款
	public String addmoneyforgeturl(String userno, String price, String desc,
			String attach, String sign);

	// 微信支付二维码
	public String forwxurl(String userno, String price, String desc,
			String attach, String sign);

	// 微信app支付
	public String forwxappinfo(String userno, String price, String desc,
			String attach, String sign);

	// 前台展示二维码订单
	public String getqrcodeorderlist(String userno, long timestart,
			long timeend, int billstage, int ordermode, String spbillno,
			String sign);

	// 前台扫码枪生成订单
	public String Qqpay(String userno, String price, String desc,
			String attach, String authcode);

	// 前台扫码枪生成微信订单
	public String WXpay(String userno, String price, String desc,
			String attach, String authcode);

	/**
	 * 管理员注册，超级管理员才能用的方法，为数据库保存密码为md5加密字段而应用的方法
	 */
	public String addmanager(@WebParam(name = "account") String account,
			@WebParam(name = "password") String password,
			@WebParam(name = "sign") String sign);

	/** 管理员登录 */
	public String managerlogin(@WebParam(name = "account") String account,
			@WebParam(name = "strmd5") String strmd5,
			@WebParam(name = "sign") String sign);

	/**
	 * 管理员修改密码
	 */
	public String mergemanagerpass(
			@WebParam(name = "managerno") String managerno,
			@WebParam(name = "strmd5") String strmd5,
			@WebParam(name = "newpass") String newpass,
			@WebParam(name = "sign") String sign);

	/** 后台添加用户级别 */
	public String adduserlevel(@WebParam(name = "managerno") String managerno,
			@WebParam(name = "levelno") String levelname,
			@WebParam(name = "sign") String sign);

	/** 后台修改用户级别信息 */
	public String mergeuserlevelinfo(
			@WebParam(name = "managerno") String managerno,
			@WebParam(name = "levelno") String levelno,
			@WebParam(name = "levelname") String levelname,
			@WebParam(name = "sign") String sign);

	/**
	 * 后台查询用户级别
	 */
	public String getuserlevellist(
			@WebParam(name = "managerno") String managerno,
			@WebParam(name = "sign") String sign,
			@WebParam(name = "pagesize") int pagesize,
			@WebParam(name = "page") int page,
			@WebParam(name = "h") Holder<Integer> h);

	/**
	 * 后台修改单个用户的级别
	 */
	public String mergeuserlevel(
			@WebParam(name = "managerno") String managerno,
			@WebParam(name = "userno") String userno,
			@WebParam(name = "levelno") String levelno,
			@WebParam(name = "sign") String sign);

	/** 管理员展示所有用户信息 */
	public String getuseralllist(
			@WebParam(name = "managerno") String managerno,
			@WebParam(name = "userstate") int userstate,
			@WebParam(name = "userno") String userno,
			@WebParam(name = "shopname") String shopname,
			@WebParam(name = "username") String username,
			@WebParam(name = "sign") String sign,
			@WebParam(name = "pagesize") int pagesize,
			@WebParam(name = "page") int page,
			@WebParam(name = "h") Holder<Integer> h);

	/** 后台修改用户状态 */
	public String mergexjuserstate(
			@WebParam(name = "managerno") String managerno,
			@WebParam(name = "userno") String userno,
			@WebParam(name = "userstate") int userstate,
			@WebParam(name = "sign") String sign);

	/**
	 * 后台重置用户密码
	 */
	public String resetuserpass(@WebParam(name = "managerno") String managerno,
			@WebParam(name = "userno") String userno,
			@WebParam(name = "sign") String sign);

	/**
	 * 开关注册审核状态
	 */
	public String mergesysinfo(boolean b);

	/** 后台展示储值记录 */
	// 已测试
	public String getaddmoneyalllist(
			@WebParam(name = "managerno") String managerno,
			@WebParam(name = "userno") String userno,
			@WebParam(name = "timestart") long timestart,
			@WebParam(name = "timeend") long timeend,
			@WebParam(name = "state") int state,
			@WebParam(name = "sign") String sign,
			@WebParam(name = "pagesize") int pagesize,
			@WebParam(name = "page") int page,
			@WebParam(name = "h") Holder<Integer> h);

	/**
	 * 管理员添加储值
	 */
	public String addmoneyformanager(
			@WebParam(name = "managerno") String managerno,
			@WebParam(name = "userno") String userno,
			@WebParam(name = "amount") double amount,
			@WebParam(name = "remark") String remark,
			@WebParam(name = "sign") String sign);

	/** 后台修改用户储值 */
	public String mergeaddmoneyforbank(
			@WebParam(name = "managerno") String managerno,
			@WebParam(name = "addmoneyno") String addmoneyno,
			@WebParam(name = "state") int state,
			@WebParam(name = "sign") String sign);

	/** 后台展示二维码订单 */
	// 已测试
	public String getqrcodeorderalllist(
			@WebParam(name = "managerno") String managerno,
			@WebParam(name = "xjuserno") String xjuserno,
			@WebParam(name = "timestart") long timestart,
			@WebParam(name = "timeend") long timeend,
			@WebParam(name = "billstage") int billstage,
			@WebParam(name = "ordermode") int ordermode,
			@WebParam(name = "spbillno") String spbillno,
			@WebParam(name = "sign") String sign,
			@WebParam(name = "pagesize") int pagesize,
			@WebParam(name = "page") int page,
			@WebParam(name = "h") Holder<Integer> h);

	/**
	 * 查看用户操作日志
	 */
	public String getuserlogalllist(
			@WebParam(name = "managerno") String managerno,
			@WebParam(name = "userno") String userno,
			@WebParam(name = "timestart") long timestart,
			@WebParam(name = "timeend") long timeend,
			@WebParam(name = "sign") String sign,
			@WebParam(name = "pagesize") int pagesize,
			@WebParam(name = "page") int page,
			@WebParam(name = "h") Holder<Integer> h);

	/**
	 * 查看管理员操作日志
	 */
	public String getmanagerlogalllist(
			@WebParam(name = "managerno") String managerno,
			@WebParam(name = "timestart") long timestart,
			@WebParam(name = "timeend") long timeend,
			@WebParam(name = "sign") String sign,
			@WebParam(name = "pagesize") int pagesize,
			@WebParam(name = "page") int page,
			@WebParam(name = "h") Holder<Integer> h);

	/**
	 * 后台获取通知消息
	 */
	public String getmessage(@WebParam(name = "managerno") String managerno,
			@WebParam(name = "sign") String sign);
}
