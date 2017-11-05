package com.pkm.kumba.service;

import com.pkm.kumba.entity.Order;
import com.pkm.kumba.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class OrderServiceImpl implements OrderService {


    @Autowired
    OrderRepository orderRepository;

    public void retrieveAllPlantOrders() {
        Iterable<Order> orderList = orderRepository.findAll();
        orderList.forEach(System.out::println);
    }

    public void orderPlant(String plantName){
        LocalDateTime localDateTime = LocalDateTime.now();
        Order order=new Order();
        order.setName(plantName);
        order.setType("Outdoor");
        order.setPrice(52.0);
        order.setCreatedDate(localDateTime);
        order.setUpdatedDate(localDateTime);
        orderRepository.save(order);


    }

}
