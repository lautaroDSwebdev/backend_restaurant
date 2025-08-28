package com.example.demo.service.inter;


import com.example.demo.entity.OrdersStateEntity;

import java.util.List;

public interface IOrderStateService {

    public List<OrdersStateEntity> GetOrdersState();
    public void PostOrdersStateEntity(OrdersStateEntity e);
    public void PutOrdersStateEntity(OrdersStateEntity e);
    public void DeleteOrdersStateEntity(Long id);
    public OrdersStateEntity FindOrdersStateEntity(Long id);
}
