package com.example.prison.controllers;

import com.example.prison.models.Cellule;
import com.example.prison.services.impl.CelluleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("cellules")
@CrossOrigin
public class CelluleController {
    @Autowired
    private CelluleServiceImpl service;

    @GetMapping
    public List<Cellule> findAll(){
        return this.service.findAll();
    }

    @GetMapping("{id}")
    public Optional<Cellule> findById(@PathVariable Long id){
        return this.service.findById(id);
    }
    @PostMapping
    public Cellule save(Cellule cellule){
        return this.service.save(cellule);
    }
    @PatchMapping
    public Cellule update(@RequestBody Cellule cellule){
        return  this.service.save(cellule);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        this.service.deleteById(id);
    }
}
