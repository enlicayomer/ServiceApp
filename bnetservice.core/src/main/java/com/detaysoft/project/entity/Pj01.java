package com.detaysoft.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "[/ATOM/PJ01]", schema = "SAPSR3")
@IdClass(Pj01Key.class)
public class Pj01 {
	@Id
	@Column(name = "CLID")
	private String clid;

	@Id
	@Column(name = "PJID")
	private String pjid;

	@Column(name = "PJTX")
	private String pjtx;

	public String getClid() {
		return clid;
	}

	public void setClid(String clid) {
		this.clid = clid;
	}

	public String getPjid() {
		return pjid;
	}

	public void setPjid(String pjid) {
		this.pjid = pjid;
	}

	public String getPjtx() {
		return pjtx;
	}

	public void setPjtx(String pjtx) {
		this.pjtx = pjtx;
	}

}
