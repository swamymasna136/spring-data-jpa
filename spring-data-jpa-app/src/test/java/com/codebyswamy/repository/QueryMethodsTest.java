package com.codebyswamy.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.codebyswamy.entity.Product;

@SpringBootTest
public class QueryMethodsTest {

	@Autowired
	private ProductRepository productRepository;
	/*
	 * @Test void findByNameMethod() {
	 * 
	 * Product product = productRepository.findByName("product2");
	 * 
	 * System.out.println(product); }
	 * 
	 * 
	 * @Test void findByIdMethod() {
	 * 
	 * Product product = productRepository.findById(12).get();
	 * 
	 * System.out.println(product); }
	 */

	@Test
	void findByNameOrDescriptionMethod() {

		List<Product> products = productRepository
				.findByNameOrDescription("product2", "product2 description");

		products.forEach((p) -> {

			System.out.println(p);
		});
	}

}
