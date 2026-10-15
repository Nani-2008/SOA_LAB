package com.example.role.touristmodel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TouristRepository
        extends JpaRepository<tourist, Integer> {
}