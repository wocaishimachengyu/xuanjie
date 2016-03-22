package com.xuanjie.po;

import java.util.Date;

public class XjUser {
	private String userno;
	private String levelno;
	private String account;
	private String password;
	private String identityid;
	private String username;
	private String telephone;
	private String address;
	private String paypassword;
	private String shopname;
	private String photo;
	private Integer userstate;
	private String logininfo;
	private Date producetime;
	private String loginmode;
	private String szqqinfo;
	private String szagentip;
	private String szreferee;
	private String sztoken;
	private String userclass;
	private String mgr;
	private String submchid;
	public XjUser(String userno, String levelno, String account,
			String password, String identityid, String username,
			String telephone, String address, String paypassword,
			String shopname, String photo, Integer userstate, String logininfo,
			Date producetime, String loginmode, String szqqinfo,
			String szagentip, String szreferee, String sztoken,
			String userclass, String mgr, String submchid) {
		super();
		this.userno = userno;
		this.levelno = levelno;
		this.account = account;
		this.password = password;
		this.identityid = identityid;
		this.username = username;
		this.telephone = telephone;
		this.address = address;
		this.paypassword = paypassword;
		this.shopname = shopname;
		this.photo = photo;
		this.userstate = userstate;
		this.logininfo = logininfo;
		this.producetime = producetime;
		this.loginmode = loginmode;
		this.szqqinfo = szqqinfo;
		this.szagentip = szagentip;
		this.szreferee = szreferee;
		this.sztoken = sztoken;
		this.userclass = userclass;
		this.mgr = mgr;
		this.submchid = submchid;
	}
	public XjUser() {
		super();
	}
	public String getUserno() {
		return userno;
	}
	public void setUserno(String userno) {
		this.userno = userno;
	}
	public String getLevelno() {
		return levelno;
	}
	public void setLevelno(String levelno) {
		this.levelno = levelno;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getIdentityid() {
		return identityid;
	}
	public void setIdentityid(String identityid) {
		this.identityid = identityid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPaypassword() {
		return paypassword;
	}
	public void setPaypassword(String paypassword) {
		this.paypassword = paypassword;
	}
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Integer getUserstate() {
		return userstate;
	}
	public void setUserstate(Integer userstate) {
		this.userstate = userstate;
	}
	public String getLogininfo() {
		return logininfo;
	}
	public void setLogininfo(String logininfo) {
		this.logininfo = logininfo;
	}
	public Date getProducetime() {
		return producetime;
	}
	public void setProducetime(Date producetime) {
		this.producetime = producetime;
	}
	public String getLoginmode() {
		return loginmode;
	}
	public void setLoginmode(String loginmode) {
		this.loginmode = loginmode;
	}
	public String getSzqqinfo() {
		return szqqinfo;
	}
	public void setSzqqinfo(String szqqinfo) {
		this.szqqinfo = szqqinfo;
	}
	public String getSzagentip() {
		return szagentip;
	}
	public void setSzagentip(String szagentip) {
		this.szagentip = szagentip;
	}
	public String getSzreferee() {
		return szreferee;
	}
	public void setSzreferee(String szreferee) {
		this.szreferee = szreferee;
	}
	public String getSztoken() {
		return sztoken;
	}
	public void setSztoken(String sztoken) {
		this.sztoken = sztoken;
	}
	public String getUserclass() {
		return userclass;
	}
	public void setUserclass(String userclass) {
		this.userclass = userclass;
	}
	public String getMgr() {
		return mgr;
	}
	public void setMgr(String mgr) {
		this.mgr = mgr;
	}
	public String getSubmchid() {
		return submchid;
	}
	public void setSubmchid(String submchid) {
		this.submchid = submchid;
	}
}
