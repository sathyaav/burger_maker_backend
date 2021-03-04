package com.cloud.burger.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.burger.constants.KafkaConstants;
import com.cloud.burger.models.Order;
import com.cloud.burger.services.OrderService;

@RestController
public class OrdersController {

	
	@Autowired
	OrderService service;
	
	
	
	@PostMapping(value="/api/sendOrder", consumes= "application/json", produces="application/json")
	public void sendOrder(@RequestBody Order order) {
		System.out.println("sending order: "+order.getCustomer());
		service.createOrder(order);
	
	}
	
	
	@KafkaListener(
			topics = KafkaConstants.KAFKA_TOPIC,
			groupId = KafkaConstants.GROUP_ID
			
	)
	public void receiveOrder(Order order) {
		System.out.println("received order: "+order.getTimestamp());
		service.processOrder(order);
		
	}
}
