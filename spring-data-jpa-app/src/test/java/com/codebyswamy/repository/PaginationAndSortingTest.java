package com.codebyswamy.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.codebyswamy.entity.Product;

@SpringBootTest
public class PaginationAndSortingTest {

	@Autowired
	private ProductRepository productRepository;

	@Test
	void paginationAndSorting() {

		String sortBy = "name";

		String sortDir = "desc";

		int pageNo = 2;

		int pageSize = 3;

		// sort object
		Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortBy).ascending()
				: Sort.by(sortBy).descending();

		// Pageable Object
		Pageable pageable = PageRequest.of(pageNo, pageSize, sort);

		Page<Product> page = productRepository.findAll(pageable);

		List<Product> products = page.getContent();

		products.forEach((p) -> {
			System.out.println(p);
		});

		// total pages
		int totalPages = page.getTotalPages();

		// total elements
		long totalElements = page.getTotalElements();

		// number of elements
		int numberOfElements = page.getNumberOfElements();

		// size
		int size = page.getSize();

		boolean last = page.isLast();

		boolean first = page.isFirst();

		System.out.println("Total Pages : " + totalPages);
		System.out.println("Total Elements : " + totalElements);
		System.out.println("Number of Elements : " + numberOfElements);
		System.out.println("Size : " + size);
		System.out.println("Is Last : " + last);
		System.out.println("Is First : " + first);
	}
}
