package com.techpalle.springbootrest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techpalle.springbootrest.entity.Product;
import com.techpalle.springbootrest.repository.InventoryRepository;

@Service 

public class InventoryService {
	//we need repository object
	private final InventoryRepository repository;
	@Autowired
	public InventoryService (InventoryRepository repository)
	{
		this.repository=repository;
	}
	//service layer will have business logic + minimum 5 functions crud operations
	// 1. a function required to insert row into product table
	public Product saveProduct(Product p) {
		//we will write some code to insert a row
		//save function returns product.we have to catch that product
		Product obj =repository.save(p);
		return obj;
		
	}
	// >>.a function to read one product
	public List<Product> readAllProducts(){
		List<Product>products=repository.findAll();
		return products;
		
	}
	// >>. a function delete
	public void deleteProduct(int pno)
	{
		repository.deleteById(pno);
	}
	// >>. a function to update
	public Product updateproduct(int pno,Product np)
	{
		Optional<Product>temp=repository.findById(pno);
		if(temp.isPresent()) {
			Product p=temp.get();
			p.setPname(np.getPname());
			p.setPprice(np.getPprice());
			p.setPqty(np.getPqty());
			return repository.save(p);
		}
		else {
			throw new RuntimeException("product not available");
		}
	}
	
	
	
	// 5.a function to read all products

}
