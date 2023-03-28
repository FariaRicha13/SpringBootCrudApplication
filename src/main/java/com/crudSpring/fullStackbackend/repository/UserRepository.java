package com.crudSpring.fullStackbackend.repository;

import com.crudSpring.fullStackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
