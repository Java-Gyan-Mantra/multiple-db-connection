package com.javatechie.db.test.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MySqlProduct {
	@Id
	private int id;
	private String name;
	private int qty;
	private double price;
}
