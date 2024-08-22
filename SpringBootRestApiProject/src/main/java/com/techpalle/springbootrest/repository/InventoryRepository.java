package com.techpalle.springbootrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techpalle.springbootrest.entity.Product;

@Repository

public interface InventoryRepository extends JpaRepository<Product, Integer> {
	//IF WE DONT EXTEND JPA REPOSITORY
	//1.WE HAVE TO WRITE ALL HIBARNATE CODE TO PERFORM CRUD OPERATIONS
	//WRITE A METHOD FOR INSERT

}
