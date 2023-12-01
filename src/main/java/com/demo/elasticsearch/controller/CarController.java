package com.demo.elasticsearch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.elasticsearch.model.Car;
import com.demo.elasticsearch.repository.CarRepository;

import lombok.NoArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
@RequestMapping("/car")
@NoArgsConstructor
public class CarController {
    
    @Autowired
    CarRepository carRepository;

    @GetMapping()
    private ResponseEntity<Iterable<Car>> getAllCar(){
        return new ResponseEntity<Iterable<Car>>(carRepository.findAll(), HttpStatus.ACCEPTED);
    }

    @PostMapping()
    public ResponseEntity<Car> postMethodName(@RequestBody Car entity) {
        return new ResponseEntity<Car>(carRepository.save(entity), HttpStatus.CREATED);
    }
    
}
