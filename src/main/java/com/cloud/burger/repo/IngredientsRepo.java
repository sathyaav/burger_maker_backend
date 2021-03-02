/**
 * 
 */
package com.cloud.burger.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cloud.burger.modals.Ingredients;

/**
 * @author sathy
 *
 */
@RepositoryRestResource(collectionResourceRel="ingredient", path="ingredients")
public interface IngredientsRepo extends MongoRepository<Ingredients, String> {

}
