package com.cartdb.cart_service.service;

import com.cartdb.cart_service.model.CartItem;
import com.cartdb.cart_service.repository.CartItemRepository;
import com.prodService.product_service.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import org.springframework.http.HttpStatus;

@Service
public class CartService implements CartServiceInterface{

    private final CartItemRepository cartItemRepository;
    private final WebClient.Builder webClientBuilder;

    @Autowired
    public CartService(CartItemRepository cartItemRepository, WebClient.Builder webClientBuilder) {
        this.cartItemRepository = cartItemRepository;
        this.webClientBuilder = webClientBuilder;
    }

    @Override
    public Mono<CartItem> addItemToCart(CartItem cartItem) {
        return webClientBuilder.build()
                .get()
                .uri("http://localhost:8080/products/" + cartItem.getProductId())
                .retrieve()
                .onStatus(HttpStatus::is4xxClientError, clientResponse -> Mono.error(new RuntimeException("Product not found")))
                .bodyToMono(Product.class)
                .flatMap(product -> {

                    cartItem.setProductPrice(product.getPrice());
                    return cartItemRepository.save(cartItem);
                });
    }
}
