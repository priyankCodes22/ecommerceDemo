package com.prodService.product_service.service;

import com.prodService.product_service.model.Product;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public interface ProductServInterface {

    public Flux<Product> getAllProducts();
}
