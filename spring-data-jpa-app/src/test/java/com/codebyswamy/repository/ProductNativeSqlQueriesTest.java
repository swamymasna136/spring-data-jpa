package com.codebyswamy.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.codebyswamy.entity.Product;

@SpringBootTest
public class ProductNativeSqlQueriesTest {

	@Autowired
	private ProductRepository productRepository;

	@Test
	void findByNameOrDescriptionSQLIndexParamMethod() {

		Product product = productRepository
				.findByNameOrDescriptionSQLIndexParam("product2", "product2 description");
		
		System.out.println(product);

	}

}
