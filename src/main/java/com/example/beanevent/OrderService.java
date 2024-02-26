package com.example.beanevent;

import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;

public class OrderService {
    @Inject
    Event<Order> orderEvent;
    public void addOrder(Order order){
        System.out.println("Order was added...");
        // notify subscribers
        orderEvent.fire(order);
    }
}
