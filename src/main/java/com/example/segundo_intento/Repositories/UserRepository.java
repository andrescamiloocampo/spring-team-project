package com.example.segundo_intento.Repositories;

import com.example.segundo_intento.Classes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
