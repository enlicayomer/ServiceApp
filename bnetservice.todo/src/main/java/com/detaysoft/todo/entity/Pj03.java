package com.detaysoft.todo.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.springframework.data.rest.core.annotation.RestResource;

import com.detaysoft.project.entity.Pj01;
import com.detaysoft.todo.controller.ModelJsonFilters;
import com.fasterxml.jackson.annotation.JsonFilter;

@Entity
@Table(name = "[/ATOM/PJ03]", schema = "SAPSR3")
@IdClass(Pj03Key.class)
//@NamedEntityGraph(name = "Pj03.pj01",
//attributeNodes = @NamedAttributeNode("pj01"))
@JsonFilter(ModelJsonFilters.SECTEUR_FILTER)
public class Pj03 implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CLID")
	private String clid;

	@Id
	@Column(name = "TKID")
	private String tkid;

	@Column(name = "TKTX")
	private String tktx;

	@Column(name = "PJID")
	private String pjid;

	
	
//	@Fetch(FetchMode.JOIN)
	@ManyToOne(fetch=FetchType.EAGER)
	@NotFound(action = NotFoundAction.IGNORE)
	@JoinColumns({
	@JoinColumn(name="CLID",insertable=false,updatable=false),
	@JoinColumn(name="PJID",insertable=false,updatable=false)
})
	private Pj01 pj01;

	public Pj01 getPj01() {
		return pj01;
	}

	public void setPj01(Pj01 pj01) {
		this.pj01 = pj01;
	}

	public String getClid() {
		return clid;
	}

	public void setClid(String clid) {
		this.clid = clid;
	}

	public String getTkid() {
		return tkid;
	}

	public void setTkid(String tkid) {
		this.tkid = tkid;
	}

	public String getTktx() {
		return tktx;
	}

	public void setTktx(String tktx) {
		this.tktx = tktx;
	}

	public String getPjid() {
		return pjid;
	}

	public void setPjid(String pjid) {
		this.pjid = pjid;
	}

}
