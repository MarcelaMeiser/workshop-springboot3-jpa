package com.meiser.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meiser.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
}
