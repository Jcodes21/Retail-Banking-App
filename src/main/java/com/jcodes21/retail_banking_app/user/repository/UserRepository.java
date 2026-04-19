package com.jcodes21.retail_banking_app.user.repository;
import com.jcodes21.retail_banking_app.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    // custom query method
    // Spring builds the SQL automatically
    // returns Optional because email may not be found

    boolean existByEmail(String email);
    // checks if a user with this email already exists
    // useful during registration validation
}
