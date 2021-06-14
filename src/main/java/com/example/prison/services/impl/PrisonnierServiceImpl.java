package com.example.prison.services.impl;

import com.example.prison.models.Prisonnier;
import org.springframework.data.jpa.repository.JpaRepository;

public class PrisonnierServiceImpl extends GenericServiceImpl<Prisonnier> {

    public PrisonnierServiceImpl(JpaRepository<Prisonnier, Long> repository) {
        super(repository);
    }
}
