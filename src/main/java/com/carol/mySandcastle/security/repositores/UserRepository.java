package com.carol.mySandcastle.security.repositores;

import com.carol.mySandcastle.security.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional(readOnly = true)
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
    User save(User user);
}
