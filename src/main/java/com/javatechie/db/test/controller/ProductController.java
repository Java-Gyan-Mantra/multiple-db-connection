package com.javatechie.db.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.db.test.model.InputRequest;
import com.javatechie.db.test.model.MongoProduct;
import com.javatechie.db.test.model.MySqlProduct;
import com.javatechie.db.test.repository.ProductMongoRepository;
import com.javatechie.db.test.repository.ProductMySqlRepository;

@RestController
public class ProductController {

	@Autowired
	private ProductMongoRepository mongoRepository;
	@Autowired
	private ProductMySqlRepository mySqlRepository;

	@PostMapping("/addProduct")
	public String addProduct(@RequestBody InputRequest request) {
		mongoRepository.save(new MongoProduct(request.getId(), request.getName(), request.getQty(), request.getPrice()));
		mySqlRepository.save(new MySqlProduct(request.getId(), request.getName(), request.getQty(), request.getPrice()));
		return "product added on both db";
	}

	@GetMapping("/getMongoProducts")
	public List<MongoProduct> getAllFromMongo() {
		return mongoRepository.findAll();
	}

	@GetMapping("/getMySQLProducts")
	public List<MySqlProduct> getAllFromMySQL() {
		return mySqlRepository.findAll();
	}
}
