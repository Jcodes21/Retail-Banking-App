package com.jcodes21.retail_banking_app.card.Repository;
import com.jcodes21.retail_banking_app.card.entity.Card;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CardRepository extends JpaRepository<Card, UUID> {
    Optional<Card> findCardByCardNumber(String cardNumber);

    // Return true/false if a card with this card number already exists.
    boolean existsByCardNumber(String cardNumber);
    };
}
