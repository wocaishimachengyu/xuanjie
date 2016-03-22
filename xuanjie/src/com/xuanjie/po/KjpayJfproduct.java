package com.xuanjie.po;

import org.springframework.stereotype.Component;

@Component
public class KjpayJfproduct {
	private Integer id;
	private String productid;
	private String diqu;
	private Integer yys;
	private Integer productclass;
	private Integer producttype;
	private double mianzhimin;
	private double mianzhimax;
	private Integer onlineflag;
	private Integer px;
	public KjpayJfproduct() {
		super();
	}
	public KjpayJfproduct(Integer id, String productid, String diqu,
			Integer yys, Integer productclass, Integer producttype,
			double mianzhimin, double mianzhimax, Integer onlineflag, Integer px) {
		super();
		this.id = id;
		this.productid = productid;
		this.diqu = diqu;
		this.yys = yys;
		this.productclass = productclass;
		this.producttype = producttype;
		this.mianzhimin = mianzhimin;
		this.mianzhimax = mianzhimax;
		this.onlineflag = onlineflag;
		this.px = px;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getDiqu() {
		return diqu;
	}
	public void setDiqu(String diqu) {
		this.diqu = diqu;
	}
	public Integer getYys() {
		return yys;
	}
	public void setYys(Integer yys) {
		this.yys = yys;
	}
	public Integer getProductclass() {
		return productclass;
	}
	public void setProductclass(Integer productclass) {
		this.productclass = productclass;
	}
	public Integer getProducttype() {
		return producttype;
	}
	public void setProducttype(Integer producttype) {
		this.producttype = producttype;
	}
	public double getMianzhimin() {
		return mianzhimin;
	}
	public void setMianzhimin(double mianzhimin) {
		this.mianzhimin = mianzhimin;
	}
	public double getMianzhimax() {
		return mianzhimax;
	}
	public void setMianzhimax(double mianzhimax) {
		this.mianzhimax = mianzhimax;
	}
	public Integer getOnlineflag() {
		return onlineflag;
	}
	public void setOnlineflag(Integer onlineflag) {
		this.onlineflag = onlineflag;
	}
	public Integer getPx() {
		return px;
	}
	public void setPx(Integer px) {
		this.px = px;
	}
}
