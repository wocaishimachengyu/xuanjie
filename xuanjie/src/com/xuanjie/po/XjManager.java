package com.xuanjie.po;

import java.util.Date;

public class XjManager {
	private String managerno;
	private String account;
	private String password;
	private String logininfo;
	private Date producetime;
	public XjManager() {
		super();
	}
	public XjManager(String managerno, String account, String password,
			String logininfo, Date producetime) {
		super();
		this.managerno = managerno;
		this.account = account;
		this.password = password;
		this.logininfo = logininfo;
		this.producetime = producetime;
	}
	public String getManagerno() {
		return managerno;
	}
	public void setManagerno(String managerno) {
		this.managerno = managerno;
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
}
