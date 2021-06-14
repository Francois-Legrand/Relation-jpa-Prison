package com.example.prison.services.impl;

import com.example.prison.models.Cellule;
import org.springframework.data.jpa.repository.JpaRepository;

public class CelluleServiceImpl extends GenericServiceImpl<Cellule>{

    public CelluleServiceImpl(JpaRepository<Cellule, Long> repository) {
        super(repository);
    }
}
