package com.jcodes21.retail_banking_app.card.entity;
import jakarta.persistence.*;
import org.springframework.context.annotation.Primary;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table="card"
public class Card {
    @PrimaryKeyJoinColumn
    @GeneratedValue
    UUID id;
    @ForeignKey
    UUID accountId;
    String hashedPin;
    String cardNumber;
    String AccountNumber;
    String sortCode;
    String securityCode;
    LocalDateTime expiryDate;
    LocalDateTime created_at;
}
