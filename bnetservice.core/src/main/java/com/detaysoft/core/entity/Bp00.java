package com.detaysoft.core.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonView;

/**
 * Created by serhatboyraz on 6.09.2017.
 */
@Entity
@IdClass(Bp00Key.class)
@Table(name = "[/ATOM/BP00]", schema = "SAPSR3")
public class Bp00 {

    @Id
    @Column(name = "CLID")
    @JsonView({Views.BusinessPersonList.class,Views.UserList.class})
    private String clid;

    @Id
    @Column(name = "BPID")
    @JsonView({Views.BusinessPersonList.class,Views.UserList.class})

    private String bpid;

    @Column(name = "BPNM")
    @JsonView({Views.BusinessPersonList.class,Views.UserList.class})
    private String bpnm;

    @Column(name = "USID")
    @JsonView({Views.BusinessPersonList.class,Views.UserList.class})
    private String usid;
    
    @JoinColumns({
		@JoinColumn(name="CLID",referencedColumnName="CLID",insertable=false,updatable=false),
		@JoinColumn(name="USID",referencedColumnName="USID",insertable=false,updatable=false),
    })
    @OneToOne
    @JsonView({Views.BusinessPersonList.class})
    private Us00 us00;

    //region Get-Set

    public Us00 getUs00() {
		return us00;
	}

	public void setUs00(Us00 us00) {
		this.us00 = us00;
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

    public String getBpnm() {
        return bpnm;
    }

    public void setBpnm(String bpnm) {
        this.bpnm = bpnm;
    }

    public String getUsid() {
        return usid;
    }

    public void setUsid(String usid) {
        this.usid = usid;
    }

    //endregion
}
