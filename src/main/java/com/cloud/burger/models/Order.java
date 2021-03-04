package com.cloud.burger.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@RequiredArgsConstructor
@Document("orders")
@ToString
public class Order {

	@Id
	private String id;
	
	private Customer customer;
	
	private Ingredients ingredients;
	
	private Double price;
	
	private String timestamp;
	
}
