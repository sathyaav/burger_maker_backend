package com.cloud.burger.modals;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@Document("orders")
public class Order {

	@Id
	private String id;
	
	private Customer customer;
	
	private Ingredients ingredients;
	
	private Double price;
	
}
