package com.example.role.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.role.touristmodel.*;

@Service
public class touristservice {

    private final TouristRepository repo;

    public touristservice(TouristRepository repo) {
        this.repo = repo;
    }

    public List<tourist> getAllTourists() {
        return repo.findAll();
    }
}