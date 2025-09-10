package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import org.springframework.security.core.userdetails.User;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Builder
@Entity
public class OrdersStateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private int status;


//    @ManyToOne
//    @JoinColumn(name = "user_orderstate_id")
//    private UserEntity user_orderstate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NotBlank
    public int getStatus() {
        return status;
    }

    public void setStatus(@NotBlank int status) {
        this.status = status;
    }
}
