package com.cloud.burger;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BurgerMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BurgerMicroservicesApplication.class, args);
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {

	    return new WebMvcConfigurer() {
	        @Override
	        public void addCorsMappings(CorsRegistry registry) {
	            registry.addMapping("/**")
	                    .allowedOrigins("https://example.com",
	                            "https://www.example.com",
	                            "http://localhost:3000",
	                            "http://localhost:8080")
	                    .allowedMethods("*")
	                    .allowedHeaders("*");
	        }
	    
	   };
	}

}
