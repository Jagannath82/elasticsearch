package com.demo.elasticsearch.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(indexName = "carindex")
public class Car {
    
    @Id
    private String carId;

    @Field(type = FieldType.Text)
    private String model;

    @Field(type = FieldType.Text)
    private String make;

    @Field(type = FieldType.Text)
    private String year;

    @Field(type = FieldType.Text)
    private String owner;
}
