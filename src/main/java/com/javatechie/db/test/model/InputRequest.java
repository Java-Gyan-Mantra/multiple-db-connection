package com.javatechie.db.test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InputRequest {
	private int id;
	private String name;
	private int qty;
	private double price;
}
