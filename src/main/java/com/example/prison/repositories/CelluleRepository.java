package com.example.prison.repositories;

import com.example.prison.models.Cellule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CelluleRepository extends JpaRepository<Cellule, Long> {

}
