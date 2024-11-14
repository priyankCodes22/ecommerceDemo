package com.cartdb.cart_service.DTO;

import lombok.Data;

@Data
public class CartItemDTO {

    private Long id;
    private String productId;
    private int quantity;
}
