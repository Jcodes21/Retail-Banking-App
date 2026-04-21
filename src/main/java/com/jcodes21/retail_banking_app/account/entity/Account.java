package com.jcodes21.retail_banking_app.account.entity;

import jakarta.persistence.*;
import java.util.UUID;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue
    private UUID id;
    // private UUID user.id;
    private BigDecimal balance;
    private AccountType accountType; //created this type in package files
    private String sortCode;
    private String accountNumber;
    private AccountStatus status; //enum forces 1state, bool could've been both frozen + active = true
    private LocalDateTime createdAt;
}