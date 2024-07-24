package com.example.demo_spring_2.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity(name = "order")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerOrder {
    @Id
    @Column(name = "order_id")
    private String orderId;
    @Column(name = "order_date",columnDefinition = "DATETIME",nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Column(name = "amount",precision = 2)
    private double amount;
    @Column(name = "status")
    private boolean status;
    @ManyToOne
    @JoinColumn(name = "user",nullable = false)
    private User user;
}
