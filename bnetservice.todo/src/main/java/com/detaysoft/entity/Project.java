package com.detaysoft.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String pname;
	private String ptype;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return pname;
	}
	public void setName(String name) {
		this.pname = name;
	}
	public String getType() {
		return ptype;
	}
	public void setType(String type) {
		this.ptype = type;
	}
	
	
}
