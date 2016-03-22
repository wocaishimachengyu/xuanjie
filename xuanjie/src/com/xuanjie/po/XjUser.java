package com.xuanjie.po;

import java.util.Date;

public class XjUser {
	private String userno;
	private String levelno;
	private String account;
	private String password;
	private String indentityid;
	private String username;
	private String telephone;
	private String address;
	private String paypassword;
	private String shopname;
	private String photo;
	private Integer userstate;
	private String logininfo;
	private Date producttime;
	private String loginmode;
	private String szqqinfo;
	private String szagentip;
	private String szreferee;
	private String sztoken;
	private String userclass;
	private String szkey;
	public XjUser() {
		super();
	}
	public XjUser(String userno, String levelno, String account,
			String password, String indentityid, String username,
			String telephone, String address, String paypassword,
			String shopname, String photo, Integer userstate, String logininfo,
			Date producttime, String loginmode, String szqqinfo,
			String szagentip, String szreferee, String sztoken,
			String userclass, String szkey) {
		super();
		this.userno = userno;
		this.levelno = levelno;
		this.account = account;
		this.password = password;
		this.indentityid = indentityid;
		this.username = username;
		this.telephone = telephone;
		this.address = address;
		this.paypassword = paypassword;
		this.shopname = shopname;
		this.photo = photo;
		this.userstate = userstate;
		this.logininfo = logininfo;
		this.producttime = producttime;
		this.loginmode = loginmode;
		this.szqqinfo = szqqinfo;
		this.szagentip = szagentip;
		this.szreferee = szreferee;
		this.sztoken = sztoken;
		this.userclass = userclass;
		this.szkey = szkey;
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
	public String getIndentityid() {
		return indentityid;
	}
	public void setIndentityid(String indentityid) {
		this.indentityid = indentityid;
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
	public Date getProducttime() {
		return producttime;
	}
	public void setProducttime(Date producttime) {
		this.producttime = producttime;
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
	public String getSzkey() {
		return szkey;
	}
	public void setSzkey(String szkey) {
		this.szkey = szkey;
	}
}
