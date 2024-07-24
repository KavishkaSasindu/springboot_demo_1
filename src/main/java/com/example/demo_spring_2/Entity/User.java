package com.example.demo_spring_2.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Blob;

@Entity(name= "application_user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @Column(name="user_id",length = 80,nullable = true)
    private String UserId;
    @Column(name = "user_name",length = 100,unique = true)
    private String username;
    @Column(name = "password",length = 700,nullable = false)
    private String password;
    @Column(name = "address",length = 750,nullable = false)
    private String address;
    @Embedded
    private FileResource UserAvatar;

}
