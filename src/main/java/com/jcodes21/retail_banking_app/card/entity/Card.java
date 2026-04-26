package com.jcodes21.retail_banking_app.card.entity;
import jakarta.persistence.*;
import org.springframework.context.annotation.Primary;
import java.time.LocalDateTime;
import java.util.UUID;

@GeneratedValue
@Table("card");
public class Card {
    @Primary
    UUID id;
    @ForeignKey
    UUID accountId;
    String AccountNumber;
    String sortCode;
    String securityCode;
    LocalDateTime expiryDate;
    LocalDateTime created_at;
}
