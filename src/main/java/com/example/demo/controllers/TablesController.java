package com.example.demo.controllers;

import com.example.demo.entity.TablesRestaurantEntity;
import com.example.demo.service.Impl.TablesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TablesController {

    @Autowired
    private TablesServiceImpl tables_serv;



    @GetMapping("/service")
    public List<TablesRestaurantEntity> GetTables(){
        List<TablesRestaurantEntity> get_tables = tables_serv.GetTables();
        return get_tables;
    }

    @PostMapping("/service")
    public String PostTables(@RequestBody TablesRestaurantEntity e){
        tables_serv.PostTables(e);
        return "mesa creada";
    }

    @PutMapping("/service")
    public TablesRestaurantEntity PutTables(@RequestBody TablesRestaurantEntity e){
        tables_serv.PutTables(e);
        return tables_serv.FindTables(e.getId());
    }
    @DeleteMapping("/service/{id}")
    public String DeleteTables(@PathVariable Long id){
        tables_serv.DeleteTables(id);
        return "Mesada eliminada";
    }
}
