package com.example.prison.repositories;

import com.example.prison.models.Prisonnier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrisonnierRepository extends JpaRepository<Prisonnier, Long> {
}
