package com.faint.domain;

import java.util.Date;

public class PostVO {
	private Integer id;
	private Integer userid;
	private Integer cateid;
	private String caption;
	private Date regdate;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getCateid() {
		return cateid;
	}
	public void setCateid(Integer cateid) {
		this.cateid = cateid;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	@Override
	public String toString() {
		return "PostVO [id=" + id + ", userid=" + userid + ", cateid=" + cateid + ", caption=" + caption + ", regdate="
				+ regdate + "]";
	}
	
}
