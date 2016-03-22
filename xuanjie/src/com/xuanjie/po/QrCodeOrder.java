package com.xuanjie.po;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class QrCodeOrder {
	private String spbillno;
	private String userno;
	private double totalfee;
	private String descc;
	private Date timestart;
	private Date timeexpire;
	private String attach;
	private Integer billstage;
	private Integer ordermode;
	private String authcode;
	private String spdeviceid;
	private String signspid;
	private String couponid;
	private String transactionid;
	public QrCodeOrder() {
		super();
	}
	public QrCodeOrder(String spbillno, String userno, double totalfee,
			String descc, Date timestart, Date timeexpire, String attach,
			Integer billstage, Integer ordermode, String authcode,
			String spdeviceid, String signspid, String couponid,
			String transactionid) {
		super();
		this.spbillno = spbillno;
		this.userno = userno;
		this.totalfee = totalfee;
		this.descc = descc;
		this.timestart = timestart;
		this.timeexpire = timeexpire;
		this.attach = attach;
		this.billstage = billstage;
		this.ordermode = ordermode;
		this.authcode = authcode;
		this.spdeviceid = spdeviceid;
		this.signspid = signspid;
		this.couponid = couponid;
		this.transactionid = transactionid;
	}
	public String getSpbillno() {
		return spbillno;
	}
	public void setSpbillno(String spbillno) {
		this.spbillno = spbillno;
	}
	public String getUserno() {
		return userno;
	}
	public void setUserno(String userno) {
		this.userno = userno;
	}
	public double getTotalfee() {
		return totalfee;
	}
	public void setTotalfee(double totalfee) {
		this.totalfee = totalfee;
	}
	public String getDescc() {
		return descc;
	}
	public void setDescc(String descc) {
		this.descc = descc;
	}
	public Date getTimestart() {
		return timestart;
	}
	public void setTimestart(Date timestart) {
		this.timestart = timestart;
	}
	public Date getTimeexpire() {
		return timeexpire;
	}
	public void setTimeexpire(Date timeexpire) {
		this.timeexpire = timeexpire;
	}
	public String getAttach() {
		return attach;
	}
	public void setAttach(String attach) {
		this.attach = attach;
	}
	public Integer getBillstage() {
		return billstage;
	}
	public void setBillstage(Integer billstage) {
		this.billstage = billstage;
	}
	public Integer getOrdermode() {
		return ordermode;
	}
	public void setOrdermode(Integer ordermode) {
		this.ordermode = ordermode;
	}
	public String getAuthcode() {
		return authcode;
	}
	public void setAuthcode(String authcode) {
		this.authcode = authcode;
	}
	public String getSpdeviceid() {
		return spdeviceid;
	}
	public void setSpdeviceid(String spdeviceid) {
		this.spdeviceid = spdeviceid;
	}
	public String getSignspid() {
		return signspid;
	}
	public void setSignspid(String signspid) {
		this.signspid = signspid;
	}
	public String getCouponid() {
		return couponid;
	}
	public void setCouponid(String couponid) {
		this.couponid = couponid;
	}
	public String getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(String transactionid) {
		this.transactionid = transactionid;
	}
}
