package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

//@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MenuDishEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Size(max = 50)
    @NotBlank
    @Column(name = "nombre_del_plato")
    private String menu;

    @NotNull
    @Column(name = "precio_plato")
    private int price;

    @ManyToOne
    @JoinColumn(name = "category_menu_id", nullable = false)
    private CategoryEntity category_id;

    @ManyToOne
    @JoinColumn(name = "orderitem_menu_id", nullable = false)
    private OrderItemEntity order_menu;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<InventoryItemEntity> inventory_intem;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ReviewsEntity> reviews_menu;

    public CategoryEntity getCategory_id() {
        return category_id;
    }

    public void setCategory_id(CategoryEntity category_id) {
        this.category_id = category_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<InventoryItemEntity> getInventory_intem() {
        return inventory_intem;
    }

    public void setInventory_intem(List<InventoryItemEntity> inventory_intem) {
        this.inventory_intem = inventory_intem;
    }

    public @NotBlank String getMenu() {
        return menu;
    }

    public void setMenu(@NotBlank String menu) {
        this.menu = menu;
    }

    public OrderItemEntity getOrder_menu() {
        return order_menu;
    }

    public void setOrder_menu(OrderItemEntity order_menu) {
        this.order_menu = order_menu;
    }

    @NotNull
    public int getPrice() {
        return price;
    }

    public void setPrice(@NotNull int price) {
        this.price = price;
    }

    public List<ReviewsEntity> getReviews_menu() {
        return reviews_menu;
    }

    public void setReviews_menu(List<ReviewsEntity> reviews_menu) {
        this.reviews_menu = reviews_menu;
    }
}
