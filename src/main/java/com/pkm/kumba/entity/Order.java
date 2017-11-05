package com.pkm.kumba.entity;

import javax.persistence.*;
import java.util.Date;

@SuppressWarnings("serial")
@Entity
@Table(name="t_order")
@NamedQuery(name="Order.findAll",query="FROM Order c")
public class Order {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="ID" , updatable=false)
    private Integer Id;

    @Column(name="NAME")
    private String name;

    @Column(name="TYPE")
    private String type;

    @Column(name="PRICE")
    private Double price;

    @Temporal(TemporalType.DATE)
    @Column(name="CREATEDDATE")
    private Date createdDate;

    @Temporal(TemporalType.DATE)
    @Column(name="UPDATEDDATE")
    private Date updatedDate;



    public Order() {
    }

    public Order(Integer id, String name, String type, Double price, Date createdDate, Date updatedDate) {
        Id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
