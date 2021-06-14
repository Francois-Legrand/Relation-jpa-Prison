package com.example.prison.controllers;

import com.example.prison.models.Prisonnier;
import com.example.prison.services.impl.PrisonnierServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("prisonniers")
@CrossOrigin
public class PrisonnierController {
    @Autowired
    private PrisonnierServiceImpl service;

    @GetMapping
    public List<Prisonnier> findAll(){
        return this.service.findAll();
    }

    @GetMapping("{id}")
    public Optional<Prisonnier> findById(@PathVariable Long id){
        Prisonnier p = service.findById(id).get();
        return this.service.findById(id);
    }
    @PostMapping
    public Prisonnier save(Prisonnier prisonnier){
        return this.service.save(prisonnier);
    }
    @PatchMapping
    public Prisonnier update(@RequestBody Prisonnier prisonnier){
        return  this.service.save(prisonnier);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        this.service.deleteById(id);
    }


}
