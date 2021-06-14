package com.example.prison.services.impl;

import com.example.prison.models.Danger;
import org.springframework.data.jpa.repository.JpaRepository;

public class DangerServiceImpl extends GenericServiceImpl<Danger>{

    public DangerServiceImpl(JpaRepository<Danger, Long> repository) {
        super(repository);
    }
}
