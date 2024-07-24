package com.example.demo_spring_2.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @Column(name = "product_id",length = 80)
    private String productId;
    @Column(name = "description",length = 700,nullable = false)
    private String description;
    @Column(name = "unit_price",precision = 2,nullable = false)
    private double unitPrice;
    @Column(name = "quantity",nullable = false)
    private int quantity;
    @Embedded
    private FileResource fileResource;
}
