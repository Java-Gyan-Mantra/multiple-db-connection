package com.javatechie.db.test.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javatechie.db.test.model.MongoProduct;

public interface ProductMongoRepository extends MongoRepository<MongoProduct, Integer>{

}
