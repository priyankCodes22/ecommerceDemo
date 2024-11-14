package com.prodService.product_service.service;

import com.prodService.product_service.model.Product;
import com.prodService.product_service.repository.ProductRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class ProductService implements  ProductServInterface{

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {

        this.productRepository = productRepository;
    }


    public Flux<Product> getAllProducts() {

        return productRepository.findAll();
    }
}
