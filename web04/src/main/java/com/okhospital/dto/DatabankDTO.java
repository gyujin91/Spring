package com.okhospital.dto;

import java.sql.Date;

public class DatabankDTO {
    private int rno;
	private String rtitle;
	private String rcontent;
	private String rposter;
	private String rfilename;
	private String rview;
	private Date regdate;
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getRtitle() {
		return rtitle;
	}
	public void setRtitle(String rtitle) {
		this.rtitle = rtitle;
	}
	public String getRcontent() {
		return rcontent;
	}
	public void setRcontent(String rcontent) {
		this.rcontent = rcontent;
	}
	public String getRposter() {
		return rposter;
	}
	public void setRposter(String rposter) {
		this.rposter = rposter;
	}
	public String getRfilename() {
		return rfilename;
	}
	public void setRfilename(String rfilename) {
		this.rfilename = rfilename;
	}
	public String getRview() {
		return rview;
	}
	public void setRview(String rview) {
		this.rview = rview;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	
	
}
