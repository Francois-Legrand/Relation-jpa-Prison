package com.example.prison.services;

import java.util.List;
import java.util.Optional;

public interface GenericService<T> {
    public List<T> findAll();
    public T save(T entity);
    public Optional<T> findById(Long s);
    public void deleteById(Long s);
    public T update(T entity);
}
