package com.elifcan.librarymanagingsystem.repository;

import com.elifcan.librarymanagingsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
