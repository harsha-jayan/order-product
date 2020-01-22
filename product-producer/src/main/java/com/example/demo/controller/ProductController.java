package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;


@RestController
@RequestMapping(value = "/products")
public class ProductController {
	
	
	  @Autowired ProductRepository productRepository;
	 
	
	
	  @RequestMapping(value="/addProduct",method=RequestMethod.POST) public
	  ResponseEntity<String> addProduct(@RequestBody Product product){
	  productRepository.save(product); return new
	  ResponseEntity<>(HttpStatus.CREATED);
	  
	  }
	  
	  @RequestMapping(value="/getProducts", method=RequestMethod.GET) public
	  List<Product> getProducts(){
	  
	  return productRepository.findAll(); }
	 
	@RequestMapping(value="/message")
	public String getMessage() {
		return "success";
	}
	

}