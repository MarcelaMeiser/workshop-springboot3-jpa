package com.meiser.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meiser.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
}
