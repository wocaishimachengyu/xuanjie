package com.xuanjie.po;

import java.util.Date;

public class XjFinance {
	private String financeno;
	private String moneytypeno;
	private String userno;
	private double outin;
	private double balance;
	private Date businesstime;
	private String orderno;
	private String remark;
	public XjFinance() {
		super();
	}
	public XjFinance(String financeno, String moneytypeno, String userno,
			double outin, double balance, Date businesstime, String orderno,
			String remark) {
		super();
		this.financeno = financeno;
		this.moneytypeno = moneytypeno;
		this.userno = userno;
		this.outin = outin;
		this.balance = balance;
		this.businesstime = businesstime;
		this.orderno = orderno;
		this.remark = remark;
	}
	public String getFinanceno() {
		return financeno;
	}
	public void setFinanceno(String financeno) {
		this.financeno = financeno;
	}
	public String getMoneytypeno() {
		return moneytypeno;
	}
	public void setMoneytypeno(String moneytypeno) {
		this.moneytypeno = moneytypeno;
	}
	public String getUserno() {
		return userno;
	}
	public void setUserno(String userno) {
		this.userno = userno;
	}
	public double getOutin() {
		return outin;
	}
	public void setOutin(double outin) {
		this.outin = outin;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Date getBusinesstime() {
		return businesstime;
	}
	public void setBusinesstime(Date businesstime) {
		this.businesstime = businesstime;
	}
	public String getOrderno() {
		return orderno;
	}
	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
