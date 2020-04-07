package com.wing.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "stock-service")
public interface StockService {
    @GetMapping("/stock/decrease/{productID}/{stockCount}")
    String decreaseStock(@PathVariable("productID") Long productID, @PathVariable("stockCount")Integer stockCount);
}
