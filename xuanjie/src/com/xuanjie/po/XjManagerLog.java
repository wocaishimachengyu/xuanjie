package com.xuanjie.po;

import java.util.Date;

public class XjManagerLog {
	private String managerlogno;
	private String managerno;
	private String managerlogtype;
	private String managerlogcontent;
	private Date managerlogtime;
	public XjManagerLog() {
		super();
	}
	public XjManagerLog(String managerlogno, String managerno,
			String managerlogtype, String managerlogcontent, Date managerlogtime) {
		super();
		this.managerlogno = managerlogno;
		this.managerno = managerno;
		this.managerlogtype = managerlogtype;
		this.managerlogcontent = managerlogcontent;
		this.managerlogtime = managerlogtime;
	}
	public String getManagerlogno() {
		return managerlogno;
	}
	public void setManagerlogno(String managerlogno) {
		this.managerlogno = managerlogno;
	}
	public String getManagerno() {
		return managerno;
	}
	public void setManagerno(String managerno) {
		this.managerno = managerno;
	}
	public String getManagerlogtype() {
		return managerlogtype;
	}
	public void setManagerlogtype(String managerlogtype) {
		this.managerlogtype = managerlogtype;
	}
	public String getManagerlogcontent() {
		return managerlogcontent;
	}
	public void setManagerlogcontent(String managerlogcontent) {
		this.managerlogcontent = managerlogcontent;
	}
	public Date getManagerlogtime() {
		return managerlogtime;
	}
	public void setManagerlogtime(Date managerlogtime) {
		this.managerlogtime = managerlogtime;
	}
}
