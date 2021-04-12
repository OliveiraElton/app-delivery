package com.appdelivery.delivery.repositories;

import com.appdelivery.delivery.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
