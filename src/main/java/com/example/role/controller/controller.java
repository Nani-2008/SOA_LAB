package com.example.role.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.example.role.service.touristservice;
import com.example.role.touristmodel.tourist;

@RestController
@RequestMapping("/tourists")
public class controller {

    private final touristservice service;

    public controller(touristservice service) {
        this.service = service;
    }

    @GetMapping
    public List<tourist> getAllTourists() {
        return service.getAllTourists();
    }
}