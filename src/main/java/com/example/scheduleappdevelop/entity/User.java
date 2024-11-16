package com.example.scheduleappdevelop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User extends BaseEntity {

    @Id
    private Long userId;
    private String userName;
    private String email;
}
