package com.jcodes21.retail_banking_app.Customer.repository;
import com.jcodes21.retail_banking_app.Customer.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

// JPA/Spring Data reads these custom methods and generates the implementation.
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    // The optional class is a container object used to hold a value that may or may not be present
    //// Spring builds the SQL automatically

    boolean existByEmail(String email);
    // checks if a user with this email already exists
    // useful during registration validation
}
