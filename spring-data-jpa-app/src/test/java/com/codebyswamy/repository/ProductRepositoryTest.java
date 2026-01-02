package com.codebyswamy.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.codebyswamy.entity.Product;

@SpringBootTest
public class ProductRepositoryTest {

	@Autowired
	private ProductRepository productRepository;
	/*
	 * // @Test void saveProductTest() {
	 * 
	 * // create product Product product = new Product();
	 * product.setName("product1"); product.setPrice(5000.00);
	 * product.setDescription("product1 description");
	 * product.setImageUrl("product1.png");
	 * 
	 * // save product Product savedProduct = productRepository.save(product);
	 * 
	 * // display product details System.out.println(savedProduct); }
	 * 
	 * // @Test void updateProductTest() {
	 * 
	 * // fetch product entity by id Product product =
	 * productRepository.findById(1).get();
	 * 
	 * // update entity details product.setName("updated product1");
	 * product.setDescription("updated product1 description");
	 * 
	 * // save updated entity Product updatedProduct =
	 * productRepository.save(product);
	 * 
	 * // display the product details System.out.println(updatedProduct); }
	 * 
	 * //@Test void fetchProductByIdTest() {
	 * 
	 * Product product = productRepository.findById(1).get();
	 * 
	 * System.out.println(product); }
	 * 
	 * 
	 * @Test void saveAllProductsTest() {
	 * 
	 * // create product Product product2 = new Product();
	 * product2.setName("product2"); product2.setPrice(5000.00);
	 * product2.setDescription("product2 description");
	 * product2.setImageUrl("product2.png");
	 * 
	 * // create product Product product3 = new Product();
	 * product3.setName("product3"); product3.setPrice(5000.00);
	 * product3.setDescription("product3 description");
	 * product3.setImageUrl("product3.png");
	 * 
	 * // create product Product product4 = new Product();
	 * product4.setName("product4"); product4.setPrice(5000.00);
	 * product4.setDescription("product4 description");
	 * product4.setImageUrl("product4.png");
	 * 
	 * productRepository.saveAll(List.of(product2, product3, product4));
	 * 
	 * System.out.println("Products Saved Successfully"); }
	 * 
	 * @Test void findAllProductsTest() {
	 * 
	 * List<Product> products = productRepository.findAll();
	 * 
	 * products.forEach((p) -> { System.out.println(p); });
	 * 
	 * }
	 * 
	 * 
	 * @Test void deleteByIdMethod() {
	 * 
	 * productRepository.deleteById(14);
	 * 
	 * System.out.println("Product Deleted Successfully With Id : " + 14); }
	 */

	@Test
	void deleteMethod() {

		Product product = productRepository.findById(13).get();

		productRepository.delete(product);

		System.out.println("Product Deleted Successfully");

	}

}
