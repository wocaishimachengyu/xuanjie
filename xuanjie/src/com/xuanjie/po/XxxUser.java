package com.xuanjie.po;

import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class XxxUser {
	private Integer id;
	private String name;
	private String levelno;
	private Date createtime;
	private Integer age;
	public XxxUser() {
		super();
	}
	public XxxUser(Integer id, String name, String levelno, Date createtime,
			Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.levelno = levelno;
		this.createtime = createtime;
		this.age = age;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLevelno() {
		return levelno;
	}
	public void setLevelno(String levelno) {
		this.levelno = levelno;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}
