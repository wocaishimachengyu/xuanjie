package com.xuanjie.po;

public class XjMoneyType {
	private String moneytypeno;
	private String moneytypename;
	public XjMoneyType() {
		super();
	}
	public XjMoneyType(String moneytypeno, String moneytypename) {
		super();
		this.moneytypeno = moneytypeno;
		this.moneytypename = moneytypename;
	}
	public String getMoneytypeno() {
		return moneytypeno;
	}
	public void setMoneytypeno(String moneytypeno) {
		this.moneytypeno = moneytypeno;
	}
	public String getMoneytypename() {
		return moneytypename;
	}
	public void setMoneytypename(String moneytypename) {
		this.moneytypename = moneytypename;
	}
}
