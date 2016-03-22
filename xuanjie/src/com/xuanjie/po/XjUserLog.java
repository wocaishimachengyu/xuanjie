package com.xuanjie.po;

import java.util.Date;

public class XjUserLog {
	private String userlogno;
	private String userno;
	private String userlogtype;
	private String userlogcontent;
	private Date userlogtime;
	public XjUserLog() {
		super();
	}
	public XjUserLog(String userlogno, String userno, String userlogtype,
			String userlogcontent, Date userlogtime) {
		super();
		this.userlogno = userlogno;
		this.userno = userno;
		this.userlogtype = userlogtype;
		this.userlogcontent = userlogcontent;
		this.userlogtime = userlogtime;
	}
	public String getUserlogno() {
		return userlogno;
	}
	public void setUserlogno(String userlogno) {
		this.userlogno = userlogno;
	}
	public String getUserno() {
		return userno;
	}
	public void setUserno(String userno) {
		this.userno = userno;
	}
	public String getUserlogtype() {
		return userlogtype;
	}
	public void setUserlogtype(String userlogtype) {
		this.userlogtype = userlogtype;
	}
	public String getUserlogcontent() {
		return userlogcontent;
	}
	public void setUserlogcontent(String userlogcontent) {
		this.userlogcontent = userlogcontent;
	}
	public Date getUserlogtime() {
		return userlogtime;
	}
	public void setUserlogtime(Date userlogtime) {
		this.userlogtime = userlogtime;
	}
}
