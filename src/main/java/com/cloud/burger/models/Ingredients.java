/**
 * 
 */
package com.cloud.burger.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author sathy
 *
 */

@RequiredArgsConstructor
@Getter
@Setter
@ToString
@Document("ingredient")
public class Ingredients {

	@Id
	private String id;
	
	private Integer cheese;
	private Integer salad;
	private Integer bacon;
    private Integer meat;
    
    
	
	
}
