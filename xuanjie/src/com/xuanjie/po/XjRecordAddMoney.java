package com.xuanjie.po;

import java.util.Date;

public class XjRecordAddMoney {
	private String addmoneyno;
	private String userno;
	private double amount;
	private Date subtime;
	private Date contime;
	private Integer addmoneystate;
	private String toolname;
	private String remark;
	public XjRecordAddMoney() {
		super();
	}
	public XjRecordAddMoney(String addmoneyno, String userno, double amount,
			Date subtime, Date contime, Integer addmoneystate, String toolname,
			String remark) {
		super();
		this.addmoneyno = addmoneyno;
		this.userno = userno;
		this.amount = amount;
		this.subtime = subtime;
		this.contime = contime;
		this.addmoneystate = addmoneystate;
		this.toolname = toolname;
		this.remark = remark;
	}
	public String getAddmoneyno() {
		return addmoneyno;
	}
	public void setAddmoneyno(String addmoneyno) {
		this.addmoneyno = addmoneyno;
	}
	public String getUserno() {
		return userno;
	}
	public void setUserno(String userno) {
		this.userno = userno;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getSubtime() {
		return subtime;
	}
	public void setSubtime(Date subtime) {
		this.subtime = subtime;
	}
	public Date getContime() {
		return contime;
	}
	public void setContime(Date contime) {
		this.contime = contime;
	}
	public Integer getAddmoneystate() {
		return addmoneystate;
	}
	public void setAddmoneystate(Integer addmoneystate) {
		this.addmoneystate = addmoneystate;
	}
	public String getToolname() {
		return toolname;
	}
	public void setToolname(String toolname) {
		this.toolname = toolname;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
