package com.demo.elasticsearch.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.demo.elasticsearch.model.Car;

@Repository
public interface CarRepository extends ElasticsearchRepository<Car, String>{
    
}
