package com.example.prison.controllers;

import com.example.prison.models.Crime;
import com.example.prison.services.impl.CrimeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("crimes")
@CrossOrigin
public class CrimeController {

    @Autowired
    private CrimeServiceImpl service;

    @GetMapping
    public List<Crime> findAll(){
        return this.service.findAll();
    }

    @GetMapping("{id}")
    public Optional<Crime> findById(@PathVariable Long id){
        return this.service.findById(id);
    }
    @PostMapping
    public Crime save(Crime crime){
        return this.service.save(crime);
    }
    @PatchMapping
    public Crime update(@RequestBody Crime crime){
        return  this.service.save(crime);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        this.service.deleteById(id);
    }
}
