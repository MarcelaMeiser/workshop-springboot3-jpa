package com.meiser.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meiser.course.entities.OrderItem;
import com.meiser.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
