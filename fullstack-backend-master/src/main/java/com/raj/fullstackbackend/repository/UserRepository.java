package com.raj.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raj.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
