package com.example.tourist.service;

import com.example.tourist.entity.Tourist;
import com.example.tourist.repository.TouristRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristService {

    private final TouristRepository repository;

    public TouristService(TouristRepository repository) {
        this.repository = repository;
    }

    public List<Tourist> getAllTourists() {
        return repository.findAll();
    }
}
