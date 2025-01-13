package com.meiser.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meiser.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
}
