package com.example.prison.services.impl;

import com.example.prison.models.Crime;
import org.springframework.data.jpa.repository.JpaRepository;

public class CrimeServiceImpl extends GenericServiceImpl<Crime>{
    public CrimeServiceImpl(JpaRepository<Crime, Long> repository) {
        super(repository);
    }
}
