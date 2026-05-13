package com.example.day2.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service @Lazy
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Transactional
    public String process1() {
        Order order = new Order();
        order.setTotalPrice(100.123);
        orderRepository.save(order);
        orderRepository.deleteAll();
        return "OK";
    }

}
