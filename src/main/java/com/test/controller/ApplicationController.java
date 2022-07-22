package com.test.controller;

import com.test.dto.Student;
import com.test.entity.Toy;
import com.test.repo.ToyRepository;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApplicationController {

    private final ToyRepository toyRepository;

    public ApplicationController(ToyRepository toyRepository) {
        this.toyRepository = toyRepository;
    }

    @GetMapping("/info")
    public Student getInfo() {
        return new Student("Anastasija Mezale", "4802BD", "6");
    }

    @GetMapping("/getAll")
    public List<Toy> getAll() {
        return toyRepository.findAll();
    }

    @GetMapping("/get/{id}")
    public Toy getOne(@PathVariable long id) {
        return toyRepository.findById(id).orElseThrow(() -> new InvalidDataAccessApiUsageException("Invalid ID"));
    }

    @GetMapping("/totalprice")
    public Double getTotalPrice() {
        return toyRepository.findAll().stream()
                .mapToDouble(Toy::getPrice)
                .sum();
    }

}
