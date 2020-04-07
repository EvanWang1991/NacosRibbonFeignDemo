package com.wing.stock.service;

import org.springframework.stereotype.Service;

@Service
public class StockService {
    public String decreaseStock(Long productID, Integer stockCount){
        System.out.println("商品productid=" + productID + ", 减少库存" + stockCount);
        return "success";
    }
}
