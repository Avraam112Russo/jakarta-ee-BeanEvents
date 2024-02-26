package com.example.beanevent;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/market")
public class MarketServlet extends HttpServlet {
    @Inject
    private OrderService orderService;
    @Inject
    private OrderSubscriber orderSubscriber;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Order order = new Order();
        order.setId(100);
        order.setName("New Order");
        orderService.addOrder(order);
        System.out.println(orderSubscriber.getOrderList().get(0));
    }
}
