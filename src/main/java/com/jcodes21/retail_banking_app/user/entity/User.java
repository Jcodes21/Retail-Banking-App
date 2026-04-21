package com.jcodes21.retail_banking_app.user.entity;

import jakarta.persistence.*; // ORM (Previouusly JPA)
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String firstName;
    private String lastName;
    private String middleNames;
    private LocalDate dateOfBirth;
    private String address;
    private String postCode;
    private String email;
    private String userName;
    private String password;
    private LocalDateTime createdAt;
    private UserAccountStatus userAccountStatus;
}
