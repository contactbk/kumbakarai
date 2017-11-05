package com.pkm.kumba.controller;

import com.pkm.kumba.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PlantController {

    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/order", method = RequestMethod.POST)
    public ResponseEntity<String> placeOrder() {
        orderService.retrieveAllPlantOrders();
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
