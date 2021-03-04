package com.cloud.burger.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class Customer {
	
	private Address address;
	
	private String name;
	
	private String email;
	
}
