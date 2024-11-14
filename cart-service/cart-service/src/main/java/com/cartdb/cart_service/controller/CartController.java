package com.cartdb.cart_service.controller;

import com.cartdb.cart_service.model.CartItem;
import com.cartdb.cart_service.service.CartServiceInterface;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/cart")
public class CartController {

    private final CartServiceInterface cartService;

    public CartController(CartServiceInterface cartService) {
        this.cartService = cartService;
    }

    @PostMapping("/{cartId}/add/{productId}")
    public Mono<CartItem> addItemToCart(@PathVariable Long cartId, @PathVariable Long productId) {
        return cartService.addItemToCart(cartId,productId);
    }
}
