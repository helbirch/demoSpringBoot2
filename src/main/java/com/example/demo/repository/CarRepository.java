package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entity.Car;

@CrossOrigin(origins = "http://localhost:4202")
public interface CarRepository extends JpaRepository<Car,Long>{

}
