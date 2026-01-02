package com.codebyswamy.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.codebyswamy.entity.Product;

@SpringBootTest
public class JPQLQueriesTest {

	@Autowired
	private ProductRepository productRepository;
/*
	@Test
	void findByNameOrDescriptionJPQLIndexParamMethod() {

		Product product = productRepository.findByNameOrDescriptionJPQLIndexParam("product2", "product2 description");

		System.out.println(product);

	}
*/
	
	@Test
	void findByNameOrDescriptionJPQLNamedParamMethod() {
		
		Product product = productRepository
				.findByNameOrDescriptionJPQLNamedParam("product2", "product2 description");
		
		System.out.println(product);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
