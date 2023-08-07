package com.transactionprocessing.transactionsystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String email;
}
