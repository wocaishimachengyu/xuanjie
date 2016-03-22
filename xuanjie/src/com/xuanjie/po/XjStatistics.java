package com.xuanjie.po;

public class XjStatistics {
	private String userno;
	private double balance;
	private Integer integral;
	private double settlementbalance;
	private Integer statisticsno;
	private double owe;
	public XjStatistics() {
		super();
	}
	public XjStatistics(String userno, double balance, Integer integral,
			double settlementbalance, Integer statisticsno, double owe) {
		super();
		this.userno = userno;
		this.balance = balance;
		this.integral = integral;
		this.settlementbalance = settlementbalance;
		this.statisticsno = statisticsno;
		this.owe = owe;
	}
	public String getUserno() {
		return userno;
	}
	public void setUserno(String userno) {
		this.userno = userno;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Integer getIntegral() {
		return integral;
	}
	public void setIntegral(Integer integral) {
		this.integral = integral;
	}
	public double getSettlementbalance() {
		return settlementbalance;
	}
	public void setSettlementbalance(double settlementbalance) {
		this.settlementbalance = settlementbalance;
	}
	public Integer getStatisticsno() {
		return statisticsno;
	}
	public void setStatisticsno(Integer statisticsno) {
		this.statisticsno = statisticsno;
	}
	public double getOwe() {
		return owe;
	}
	public void setOwe(double owe) {
		this.owe = owe;
	}
}
