package com.example.prison.services.impl;

import com.example.prison.services.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public class GenericServiceImpl<T> implements GenericService<T> {
    private final JpaRepository<T, Long> repository;

    public GenericServiceImpl(JpaRepository<T, Long> repository) {
        this.repository = repository;
    }

    @Override
    public List<T> findAll() {
        return this.repository.findAll();
    }

    @Override
    public T save(T entity) {
        return this.repository.save(entity);
    }

    @Override
    public Optional<T> findById(Long id) {
        return this.repository.findById(id);
    }

    @Override
    public void deleteById(Long s) {
        this.repository.deleteById(s);
    }

    @Override
    public T update(T entity) {
        return this.repository.save(entity);
    }
}
