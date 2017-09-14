package com.detaysoft.core.entity;

import javax.persistence.*;
import javax.swing.text.View;

import com.fasterxml.jackson.annotation.JsonView;

/**
 * Created by serhatboyraz on 25.08.2017.
 */
@Entity
@IdClass(Us00Key.class)
@Table(name = "[/ATOM/US00]", schema = "SAPSR3")
public class Us00 {

    @Id
    @Column(name = "CLID")
    @JsonView({Views.BusinessPersonList.class,Views.UserList.class})
    private String clid;

    @Id
    @Column(name = "USID")
    @JsonView({Views.UserList.class})
    private String usid;


    @Column(name = "USNM")
    @JsonView({Views.BusinessPersonList.class,Views.UserList.class})
    private String usnm;

    @JsonView({Views.BusinessPersonList.class,Views.UserList.class})
    @Column(name = "BPID")
    private String bpid;

    @JsonView({Views.UserList.class})
    @JoinColumns({
		@JoinColumn(name="CLID",referencedColumnName="CLID",insertable=false,updatable=false),
		@JoinColumn(name="OJID",referencedColumnName="BPID",insertable=false,updatable=false),
    })
    @OneToOne
    private Bp00 bp00;
    
    //region Get-Set

    public Bp00 getBp00() {
		return bp00;
	}

	public void setBp00(Bp00 bp00) {
		this.bp00 = bp00;
	}

	public String getClid() {
        return clid;
    }

    public void setClid(String clid) {
        this.clid = clid;
    }

    public String getUsid() {
        return usid;
    }

    public void setUsid(String usid) {
        this.usid = usid;
    }

    public String getUsnm() {
        return usnm;
    }

    public void setUsnm(String usnm) {
        this.usnm = usnm;
    }

    public String getBpid() {
        return bpid;
    }

    public void setBpid(String bpid) {
        this.bpid = bpid;
    }

    //endregion
}
