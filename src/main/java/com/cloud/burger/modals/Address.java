package com.cloud.burger.modals;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class Address {

	private String country;
	
	private String street;
	private String zipCode;
}
