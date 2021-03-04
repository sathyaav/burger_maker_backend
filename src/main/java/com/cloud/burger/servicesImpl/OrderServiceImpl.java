package com.cloud.burger.servicesImpl;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.cloud.burger.constants.KafkaConstants;
import com.cloud.burger.models.Order;
import com.cloud.burger.repo.OrdersRepo;
import com.cloud.burger.services.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	
	@Autowired
	private KafkaTemplate<String, Order> kafkaTemplate;
	
	@Autowired
	private OrdersRepo repo;
	
	@Override
	public void createOrder(Order order) {
		order.setTimestamp(LocalDateTime.now().toString());
		
		try {
			kafkaTemplate.send(KafkaConstants.KAFKA_TOPIC, order).get();
		}catch(InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
		}

	}

	
	public void processOrder(Order order) {
		Order newOrder = repo.insert(order);
		System.out.println("new order saved "+ newOrder.getId());
	}

}
