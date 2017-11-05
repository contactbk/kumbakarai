package com.pkm.kumba.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "m_plant")
public class Plant implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long Id;

    @Column(name = "P_NAME")
    private String pName;
    @Column(name = "P_SCINAME")
    private String pSciName;
    @Column(name = "P_FLOWERABLE")
    private Integer pflowerable;
    @Column(name = "P_FRUITABLE")
    private Integer  pFruitable;
    @Column(name = "P_EDIBLE")
    private Integer pEdible;
    @Column(name = "P_TYPE")
    private String  pType;
    @Column(name = "P_AQUA")
    private Integer pAqua;
    @Column(name = "P_ENV")
    private String  pEnv;
    @Column(name = "P_CLASS")
    private String pClass;

    public Plant() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpSciName() {
        return pSciName;
    }

    public void setpSciName(String pSciName) {
        this.pSciName = pSciName;
    }

    public Integer getPflowerable() {
        return pflowerable;
    }

    public void setPflowerable(Integer pflowerable) {
        this.pflowerable = pflowerable;
    }

    public Integer getpFruitable() {
        return pFruitable;
    }

    public void setpFruitable(Integer pFruitable) {
        this.pFruitable = pFruitable;
    }

    public Integer getpEdible() {
        return pEdible;
    }

    public void setpEdible(Integer pEdible) {
        this.pEdible = pEdible;
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType;
    }

    public Integer getpAqua() {
        return pAqua;
    }

    public void setpAqua(Integer pAqua) {
        this.pAqua = pAqua;
    }

    public String getpEnv() {
        return pEnv;
    }

    public void setpEnv(String pEnv) {
        this.pEnv = pEnv;
    }

    public String getpClass() {
        return pClass;
    }

    public void setpClass(String pClass) {
        this.pClass = pClass;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "Id=" + Id +
                ", pName='" + pName + '\'' +
                ", pSciName='" + pSciName + '\'' +
                ", pflowerable=" + pflowerable +
                ", pFruitable=" + pFruitable +
                ", pEdible=" + pEdible +
                ", pType='" + pType + '\'' +
                ", pAqua=" + pAqua +
                ", pEnv='" + pEnv + '\'' +
                ", pClass='" + pClass + '\'' +
                '}';
    }
}
