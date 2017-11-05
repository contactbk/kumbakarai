package com.pkm.kumba.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "t_order")
//@TypeDef(name = "localDateTimeType", typeClass = PersistentDateTime.class)
public class Order implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long Id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "PRICE")
    private Double price;

   /*
   //Legacy approach : commented as it follows java.util.Date -
   @Temporal(TemporalType.DATE)
    @Column(name="CREATEDDATE", nullable = false)
    private Date createdDate;
    ----------------------------------------
   @Column(name="CREATEDDATE", nullable = false)
    @Type(type="localDateTimeType")
    private DateTime createdDate;*/

    @Column(name = "CREATEDDATE", nullable = false)
    private LocalDateTime createdDate;

    @Column(name = "UPDATEDDATE", nullable = false)
    private LocalDateTime updatedDate;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
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

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getUpdatedDate() {return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
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
