package com.codebyswamy.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.codebyswamy.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product findByName(String name);

	Optional<Product> findById(Integer id);

	List<Product> findByNameOrDescription(String name, String description);

	@Query("select p from Product p where p.name=?1 or p.description=?2")
	Product findByNameOrDescriptionJPQLIndexParam(String name, String description);

	@Query("select p from Product p where p.name=:name or p.description=:description")
	Product findByNameOrDescriptionJPQLNamedParam(@Param("name") String name, @Param("description") String description);

	@Query(value = "select * from products p where p.name=?1 or p.description=?2", nativeQuery = true)
	Product findByNameOrDescriptionSQLIndexParam(String name, String description);

}
