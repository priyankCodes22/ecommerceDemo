package com.cartdb.cart_service.repository;

import com.cartdb.cart_service.model.CartItem;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemRepository extends R2dbcRepository<CartItem, Long> {
}
