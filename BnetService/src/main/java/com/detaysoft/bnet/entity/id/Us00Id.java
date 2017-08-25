package com.detaysoft.bnet.entity.id;

import java.io.Serializable;
public class Us00Id implements Serializable{

	
	public Us00Id() {}
	
	String usid;
	String clid;
	String bpid;
	String syid;
	
	
	public String getUsid() {
		return usid;
	}
	public void setUsid(String usid) {
		this.usid = usid;
	}
	public String getClid() {
		return clid;
	}
	public void setClid(String clid) {
		this.clid = clid;
	}
	public String getBpid() {
		return bpid;
	}
	public void setBpid(String bpid) {
		this.bpid = bpid;
	}
	public String getSyid() {
		return syid;
	}
	public void setSyid(String syid) {
		this.syid = syid;
	}
	
	
}
