package com.antolube20.orders_services.model.dtos;

import java.util.List;

public record OrderResponse(Long id, String orderNumber, List<OrderItemsResponse> orderItems) {
}