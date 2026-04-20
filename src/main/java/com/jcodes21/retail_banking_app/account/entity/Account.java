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
    private enum accountType;
    private String sortCode;
    private String accountNumber;
    private boolean status = isActive, isFrozen;
    private LocalDateTime createdAt;
}