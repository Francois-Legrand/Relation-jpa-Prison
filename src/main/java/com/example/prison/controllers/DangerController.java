package com.example.prison.controllers;

import com.example.prison.models.Danger;
import com.example.prison.services.impl.DangerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("dangers")
@CrossOrigin
public class DangerController {
    @Autowired
    private DangerServiceImpl service;

    @GetMapping
    public List<Danger> findAll(){
        return this.service.findAll();
    }

    @GetMapping("{id}")
    public Optional<Danger> findById(@PathVariable Long id){
        return this.service.findById(id);
    }
    @PostMapping
    public Danger save(Danger danger){
        return this.service.save(danger);
    }
    @PatchMapping
    public Danger update(@RequestBody Danger danger){
        return  this.service.save(danger);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        this.service.deleteById(id);
    }
}
