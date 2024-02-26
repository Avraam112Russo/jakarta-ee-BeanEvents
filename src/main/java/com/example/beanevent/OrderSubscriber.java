package com.example.beanevent;

import jakarta.enterprise.event.Observes;
import jakarta.inject.Singleton;

import java.util.ArrayList;
import java.util.List;

@Singleton
public class OrderSubscriber {
    private List<Order> orderList = new ArrayList<>();
                                // order from event
    public void handleOrder(@Observes Order order){
        orderList.add(order);
        System.out.println("Order was added to list...");
    }

    public List<Order> getOrderList() {
        return orderList;
    }
}
