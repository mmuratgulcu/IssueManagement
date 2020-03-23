package com.gulcu.murat.springtest.repository;

import com.gulcu.murat.springtest.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Bu annotationu koymasakta olur. JpaRepository'i extend ettiğinde otomatik bu annotation varmış gibi davranır.
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
