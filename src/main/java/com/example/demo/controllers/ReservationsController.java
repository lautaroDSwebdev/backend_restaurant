package com.example.demo.controllers;

import com.example.demo.entity.ReservationsEntity;
import com.example.demo.repository.ReservationsRepo;
import com.example.demo.service.Impl.ReservationsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReservationsController {


    @Autowired
    private ReservationsServiceImpl res_service;

    @GetMapping("/reservations")
    public List<ReservationsEntity> GetReservations() {
        List<ReservationsEntity> get_res = res_service.GetReservations();
        return get_res;
    }

    @PostMapping("/reservations")
    public String PostReservations(@RequestBody ReservationsEntity e) {
        res_service.PostRevervarions(e);
        return "reserva creada";
    }

    @PutMapping("/reservations")
    public ReservationsEntity PutReservations(@RequestBody ReservationsEntity e) {
        res_service.PutRevervarions(e);
        return res_service.FindReservations(e.getId());
    }

    @DeleteMapping("reservations/{id}")
    public String DeleteReservation(@PathVariable Long id){
        res_service.DeleteReservations(id);
        return "reserva eliminada";
    }

}


