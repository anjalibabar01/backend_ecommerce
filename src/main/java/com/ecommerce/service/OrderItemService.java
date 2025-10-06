package com.ecommerce.service;

import com.ecommerce.model.OrderItem;
import org.springframework.stereotype.Service;

@Service
public interface OrderItemService {
    OrderItem createOrderItem(OrderItem orderItem);
}