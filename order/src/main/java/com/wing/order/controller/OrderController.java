package com.wing.order.controller;

import com.wing.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping(value = "/create/{productID}/{userID}/{stockCount}")
    public String createOrder(@PathVariable(value = "productID") Long productID,
                              @PathVariable(value = "userID") Long userID,
                              @PathVariable(value = "stockCount") Integer stockCount){
        return orderService.createOrder(productID, userID, stockCount);
    }
}
