package com.techpalle.springbootrest.controller;

import java.util.List;

import org.hibernate.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techpalle.springbootrest.entity.Product;
import com.techpalle.springbootrest.service.InventoryService;

@RestController
@RequestMapping("/api/v1")

public class InventoryController
{
	private final InventoryService service;
	@Autowired
	public InventoryController(InventoryService service)
	{
		this.service=service;
	}
	@PostMapping("/saveproduct")
	public ResponseEntity<Product> saveProduct(@RequestBody Product p) {
		//service here we have to call service layer save product method
		//service layer returns an object,so we need to return
	Product obj=service.saveProduct(p);
	return ResponseEntity.ok(obj);
		
	}
	@GetMapping("/getproducts")
	
	public List<Product>getproducts()
	{
		List<Product>products=service.readAllProducts();
		return products;
		
	}
	@DeleteMapping("/deleteproduct/{pno}")
	
		public void deleteProduct(@PathVariable int pno)
		{
			
		
		service.deleteProduct(pno);
	}
	@PutMapping("/updateproduct/{pno}")
	public <product> Product updateproduct(@PathVariable int pno,@RequestBody Product np)
	{
		return service.updateproduct(pno,np);
	}
	
	
		
	
	

}
