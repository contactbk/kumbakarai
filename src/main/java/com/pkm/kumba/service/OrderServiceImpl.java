package com.pkm.kumba.service;

import com.pkm.kumba.entity.Order;
import com.pkm.kumba.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {


    @Autowired
    OrderRepository orderRepository;

    public void retrieveAllPlantOrders() {
        Iterable<Order> orderList = orderRepository.findAll();
        orderList.forEach(System.out::println);

    }

}
