package com.javatechie.db.test.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="products")
public class MongoProduct {
	@Id
	private int id;
	private String name;
	private int qty;
	private double price;
}
