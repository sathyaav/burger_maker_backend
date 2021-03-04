/**
 * 
 */
package com.cloud.burger.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cloud.burger.models.Ingredients;
import com.cloud.burger.repo.IngredientsRepo;

/**
 * @author sathy
 *
 */
@Controller
public class BurgerController {

	@Autowired
	IngredientsRepo ingRepo;
	
	@RequestMapping(path = "/initialIngredients", method = RequestMethod.GET)
	public @ResponseBody Ingredients getInitialIngredients() {
		String id="603d45594c4f6eeb7806d2fc";
		Optional<Ingredients> res= ingRepo.findById(id);
		return res.get();
	}
	
}
