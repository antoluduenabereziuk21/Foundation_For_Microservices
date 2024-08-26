package com.antolube20.orders_services.model.dtos;

public record OrderItemsResponse(Long id, String sku, Double price, Long quantity) {
}
