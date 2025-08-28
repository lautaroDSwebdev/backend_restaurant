package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
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
public class ReviewsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 5)
    private int range;

    @NotBlank
    private String coment;

    @NotBlank
    private String date;

    @ManyToOne
    @JoinColumn(name = "user_reviews_id")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "menu_dish_reviews_id")
    private MenuDishEntity menu_dish;



    //    user_id

//    menu_dish_id

}
