package com.jcodes21.retail_banking_app.account.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jcodes21.retail_banking_app.account.entity.Account;
import java.util.UUID;

// JPA/Spring Data reads these custom methods and generates the implementation.
public interface AccountRepository extends JpaRepository<Account, UUID> {
    Optional<Account> findByAccountNumber(String account);
}
