package com.detaysoft.bnet.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.detaysoft.bnet.entity.id.Us00Id;

/*
 * Auto Generated Class
 */
@Entity
@Table(name="[/BNT/US00]", schema="SAPSR3")
@IdClass(Us00Id.class)
public class Us00 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USID")
	private String usid;

	@Id
	@Column(name="CLID")
	private String clid;
	
	@Id
	@Column(name="BPID")
	private String bpid;
	
	@Id
	@Column(name="SYID")
	private String syid;
	
	@Column(name="SYCON")
	private String sycon;

	@Column(name="ACTIVE")
	private String active;

	@Column(name="BEGDT")
	private String begdt;

	@Column(name="CHBP")
	private String chbp;

	@Column(name="CHDT")
	private String chdt;

	@Column(name="CHTM")
	private String chtm;

	@Column(name="CRBP")
	private String crbp;

	@Column(name="CRDT")
	private String crdt;

	@Column(name="CRTM")
	private String crtm;

	@Column(name="ENDDT")
	private String enddt;

	@Column(name="NICNAME")
	private String nicname;

	@Column(name="NOTE")
	private String note;

	@Column(name="USNM")
	private String usnm;

	@Column(name="USPS")
	private String usps;

	@Column(name="USTP")
	private String ustp;

	public Us00() {
	}

	public String getActive() {
		return this.active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getBegdt() {
		return this.begdt;
	}

	public void setBegdt(String begdt) {
		this.begdt = begdt;
	}

	public String getBpid() {
		return this.bpid;
	}

	public void setBpid(String bpid) {
		this.bpid = bpid;
	}

	public String getChbp() {
		return this.chbp;
	}

	public void setChbp(String chbp) {
		this.chbp = chbp;
	}

	public String getChdt() {
		return this.chdt;
	}

	public void setChdt(String chdt) {
		this.chdt = chdt;
	}

	public String getChtm() {
		return this.chtm;
	}

	public void setChtm(String chtm) {
		this.chtm = chtm;
	}

	public String getClid() {
		return this.clid;
	}

	public void setClid(String clid) {
		this.clid = clid;
	}

	public String getCrbp() {
		return this.crbp;
	}

	public void setCrbp(String crbp) {
		this.crbp = crbp;
	}

	public String getCrdt() {
		return this.crdt;
	}

	public void setCrdt(String crdt) {
		this.crdt = crdt;
	}

	public String getCrtm() {
		return this.crtm;
	}

	public void setCrtm(String crtm) {
		this.crtm = crtm;
	}

	public String getEnddt() {
		return this.enddt;
	}

	public void setEnddt(String enddt) {
		this.enddt = enddt;
	}

	public String getNicname() {
		return this.nicname;
	}

	public void setNicname(String nicname) {
		this.nicname = nicname;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getSycon() {
		return this.sycon;
	}

	public void setSycon(String sycon) {
		this.sycon = sycon;
	}

	public String getSyid() {
		return this.syid;
	}

	public void setSyid(String syid) {
		this.syid = syid;
	}

	public String getUsid() {
		return this.usid;
	}

	public void setUsid(String usid) {
		this.usid = usid;
	}

	public String getUsnm() {
		return this.usnm;
	}

	public void setUsnm(String usnm) {
		this.usnm = usnm;
	}

	public String getUsps() {
		return this.usps;
	}

	public void setUsps(String usps) {
		this.usps = usps;
	}

	public String getUstp() {
		return this.ustp;
	}

	public void setUstp(String ustp) {
		this.ustp = ustp;
	}

}