package com.xuanjie.po;

public class XjUserLevel {
	private String levelno;
	private String levelname;
	public XjUserLevel() {
		super();
	}
	public XjUserLevel(String levelno, String levelname) {
		super();
		this.levelno = levelno;
		this.levelname = levelname;
	}
	public String getLevelno() {
		return levelno;
	}
	public void setLevelno(String levelno) {
		this.levelno = levelno;
	}
	public String getLevelname() {
		return levelname;
	}
	public void setLevelname(String levelname) {
		this.levelname = levelname;
	}
}
