package com.example.demo.controllers;

import com.example.demo.entity.OrdersStateEntity;
import com.example.demo.service.Impl.OrderStateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders-state")
public class OrderStateController {

    @Autowired
    private OrderStateServiceImpl order_service;

    @GetMapping
    public List<OrdersStateEntity> GetOrdersState(){
        List<OrdersStateEntity> get_orders_state = order_service.GetOrdersState();
        return order_service.GetOrdersState();
    }

    @PostMapping
    public String PostOrderState(@RequestBody OrdersStateEntity e){
        order_service.PostOrderState(e);
        return "orden creada";
    }

    @PutMapping
    public OrdersStateEntity PutOrdersState(@RequestBody OrdersStateEntity e){
        order_service.PutOrderState(e);
        return order_service.FindOrderState(e.getId());
    }

    @DeleteMapping("/{id}")
    public String DeleteOrdersState(@PathVariable Long id){
        order_service.DeleteOrderState(id);
        return "orden eliminada";
    }
}
