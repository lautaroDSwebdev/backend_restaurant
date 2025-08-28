package com.example.demo.service.Impl;

import com.example.demo.entity.OrdersStateEntity;
import com.example.demo.repository.OrderStateRepo;
import com.example.demo.service.inter.IOrderStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderStateServiceImpl implements IOrderStateService {

    @Autowired
    private OrderStateRepo order_repo;

    @Override
    public List<OrdersStateEntity> GetOrdersState() {
        List<OrdersStateEntity> get_orders = order_repo.findAll();
        return get_orders;
    }

    @Override
    public void PostOrderState(OrdersStateEntity e) {
        order_repo.save(e);
    }

    @Override
    public void PutOrderState(OrdersStateEntity e) {
        this.PostOrderState(e);
    }

    @Override
    public void DeleteOrderState(Long id) {
        order_repo.deleteById(id);
    }

    @Override
    public OrdersStateEntity FindOrderState(Long id) {
        OrdersStateEntity find_order = order_repo.findById(id).orElse(null);
        return find_order;
    }
}
