package com.antolube20.orders_services.repositories;

import com.antolube20.orders_services.model.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
