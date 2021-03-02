/**
 * 
 */
package com.cloud.burger.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.cloud.burger.modals.Order;

/**
 * @author sathy
 *
 */
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "orders", path="orders")
public interface OrdersRepo extends MongoRepository<Order, String> {

}
