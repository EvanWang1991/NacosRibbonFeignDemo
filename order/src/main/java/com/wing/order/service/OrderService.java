package com.wing.order.service;

import com.wing.order.feign.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private StockService stockService;

    public String createOrder(Long productId, Long userId, Integer stockCount){
        System.out.println("创建订单成功: " + "商品ID: " + productId + "用户ID: " + userId);
        stockService.decreaseStock(productId, stockCount);
        return "Success";
    }
}
