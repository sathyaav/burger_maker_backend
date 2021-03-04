/**
 * 
 */
package com.cloud.burger.services;

import org.springframework.kafka.core.KafkaTemplate;

import com.cloud.burger.models.Order;

/**
 * @author sathy
 *
 */
public interface OrderService {
	
	public void createOrder(Order order);
	public void processOrder(Order order);
	
}
