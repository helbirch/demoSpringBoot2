package com.example.demo.controllers;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Car;
import com.example.demo.repository.CarRepository;
@RestController
public class CoolCarController {
    private CarRepository repository;

    public CoolCarController(CarRepository repository) {

        this.repository = repository;

    }

    @GetMapping("/cool-cars")
   // @RequestMapping(method=RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:4202")
    public Collection<Car> coolCars() {

        return repository.findAll().stream()

                .filter(this::isCool)

                .collect(Collectors.toList());

    }

    private boolean isCool(Car car) {

        return !car.getName().equals("AMC Gremlin") &&

                !car.getName().equals("Triumph Stag") &&

                !car.getName().equals("Ford Pinto") &&

                !car.getName().equals("Yugo GV");

    }

}