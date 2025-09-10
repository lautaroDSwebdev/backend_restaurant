package com.example.demo.repository;

import com.example.demo.entity.OrderItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdetItemRepo extends JpaRepository<OrderItemEntity, Long> {
}
