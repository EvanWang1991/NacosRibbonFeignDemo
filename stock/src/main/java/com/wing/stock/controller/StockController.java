package com.wing.stock.controller;

import com.wing.stock.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/stock")
    public class StockController {

        @Autowired
        private Registration registration;

        @Autowired
    private StockService stockService;

    @GetMapping(value = "/decrease/{productID}/{stockCount}")
    public String decreaseStock(@PathVariable("productID") Long productID, @PathVariable("stockCount") Integer stockcount){
        return stockService.decreaseStock(productID, stockcount);
    }

    @GetMapping("/getIpAndPort")
    public String getIpAndPort() {
        return registration.getHost() + ":" + registration.getPort();
    }
}
