package com.example.prison.repositories;

import com.example.prison.models.Danger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DangerRepository extends JpaRepository<Danger, Long> {
}
