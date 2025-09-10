package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OrderItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private int Quantity;

    @NotBlank
    private int price;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrdersStateEntity> ListOrdersStates;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<MenuDishEntity> ListDiches;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<MenuDishEntity> getListDiches() {
        return ListDiches;
    }

    public void setListDiches(List<MenuDishEntity> listDiches) {
        ListDiches = listDiches;
    }

    public List<OrdersStateEntity> getListOrdersStates() {
        return ListOrdersStates;
    }

    public void setListOrdersStates(List<OrdersStateEntity> listOrdersStates) {
        ListOrdersStates = listOrdersStates;
    }

    @NotBlank
    public int getPrice() {
        return price;
    }

    public void setPrice(@NotBlank int price) {
        this.price = price;
    }

    @NotBlank
    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(@NotBlank int quantity) {
        Quantity = quantity;
    }
}
