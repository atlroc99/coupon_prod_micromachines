package com.jeffry.springcloud.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description ;
    private BigDecimal price;

    //marking this field as transient bc we don't want ot create this as a column and add fields in the db
    //this is only to handle incoming request data
    //we can create a web-model object and use model mapper for this
    @Transient
    private String couponCode;
}
