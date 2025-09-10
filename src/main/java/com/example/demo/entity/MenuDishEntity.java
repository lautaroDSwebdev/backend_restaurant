package com.example.demo.entity;

import jakarta.persistence.*;
//import com.example.demo.controllers.OrderItem;
//import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MenuDishEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 50)
    private String menu;

    @NotBlank
    private Float price;

    @ManyToOne
    @JoinColumn(name = "category_menu_id", nullable = false)
    private CategoryEntity category_id;

    @ManyToOne
    @JoinColumn(name = "orderitem_menu_id", nullable = false)
    private OrderItemEntity order_menu;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<InventoryItemEntity> inventory_intem;
//   category_id

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

    public @NotBlank @Size(max = 50) String getMenu() {
        return menu;
    }

    public void setMenu(@NotBlank @Size(max = 50) String menu) {
        this.menu = menu;
    }

    public OrderItemEntity getOrder_menu() {
        return order_menu;
    }

    public void setOrder_menu(OrderItemEntity order_menu) {
        this.order_menu = order_menu;
    }

    public @NotBlank Float getPrice() {
        return price;
    }

    public void setPrice(@NotBlank Float price) {
        this.price = price;
    }
}
