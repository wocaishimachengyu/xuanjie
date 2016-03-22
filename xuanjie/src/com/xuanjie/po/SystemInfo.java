package com.xuanjie.po;

public class SystemInfo {
	private boolean sysstate;
	private Integer sysid;
	public SystemInfo() {
		super();
	}
	public SystemInfo(boolean sysstate, Integer sysid) {
		super();
		this.sysstate = sysstate;
		this.sysid = sysid;
	}
	public boolean isSysstate() {
		return sysstate;
	}
	public void setSysstate(boolean sysstate) {
		this.sysstate = sysstate;
	}
	public Integer getSysid() {
		return sysid;
	}
	public void setSysid(Integer sysid) {
		this.sysid = sysid;
	}
}
