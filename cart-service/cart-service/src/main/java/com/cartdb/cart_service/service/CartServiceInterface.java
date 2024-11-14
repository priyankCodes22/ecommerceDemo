package com.cartdb.cart_service.service;

import com.cartdb.cart_service.model.CartItem;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public interface CartServiceInterface {


    public Mono<CartItem> addItemToCart(Long cartid,Long productId) ;
}
