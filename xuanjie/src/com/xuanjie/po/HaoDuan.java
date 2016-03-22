package com.xuanjie.po;

import org.springframework.stereotype.Component;

@Component
public class HaoDuan {
	private String telepcode;
	private String code;
	private String elcode;
	private String provincename;
	private String areaname;
	private String teltype;
	private Integer flag;
	private Integer stat;
	private String remark;
	public HaoDuan() {
		super();
	}
	public HaoDuan(String telepcode, String code, String elcode,
			String provincename, String areaname, String teltype, Integer flag,
			Integer stat, String remark) {
		super();
		this.telepcode = telepcode;
		this.code = code;
		this.elcode = elcode;
		this.provincename = provincename;
		this.areaname = areaname;
		this.teltype = teltype;
		this.flag = flag;
		this.stat = stat;
		this.remark = remark;
	}
	public String getTelepcode() {
		return telepcode;
	}
	public void setTelepcode(String telepcode) {
		this.telepcode = telepcode;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getElcode() {
		return elcode;
	}
	public void setElcode(String elcode) {
		this.elcode = elcode;
	}
	public String getProvincename() {
		return provincename;
	}
	public void setProvincename(String provincename) {
		this.provincename = provincename;
	}
	public String getAreaname() {
		return areaname;
	}
	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}
	public String getTeltype() {
		return teltype;
	}
	public void setTeltype(String teltype) {
		this.teltype = teltype;
	}
	public Integer getFlag() {
		return flag;
	}
	public void setFlag(Integer flag) {
		this.flag = flag;
	}
	public Integer getStat() {
		return stat;
	}
	public void setStat(Integer stat) {
		this.stat = stat;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
