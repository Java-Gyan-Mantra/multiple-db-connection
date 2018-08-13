package com.javatechie.db.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.db.test.model.MySqlProduct;

public interface ProductMySqlRepository extends JpaRepository<MySqlProduct, Integer>{

}
