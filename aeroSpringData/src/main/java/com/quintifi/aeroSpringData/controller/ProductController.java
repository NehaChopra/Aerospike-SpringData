package com.quintifi.aeroSpringData.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quintifi.aeroSpringData.domain.Product;
import com.quintifi.aeroSpringData.service.ProductService;

@RestController
@RequestMapping(value = "/home")	
public class ProductController{
	
	@Autowired
	ProductService productService;
	
	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public List<Product> list() {
		return productService.listAllProducts();
	}
	
	@RequestMapping(value = "product/{id}", method = RequestMethod.GET)
	public Product showProduct(@PathVariable Integer id) {
		return productService.getProductById(id);
	}
	
	@RequestMapping(value = "product/{id}/edit", method = RequestMethod.GET)
	public Product editProduct(@PathVariable Integer id, Product product) {
		productService.saveProduct(product);
		return productService.getProductById(id);
	}
	
	@RequestMapping(value = "product", method = RequestMethod.POST)
	public void saveProduct(Product product) {
		productService.saveProduct(product);
	}
	
	@RequestMapping(value = "product/{id}/delete", method = RequestMethod.DELETE)
	public void deleteProduct(@PathVariable Integer id) {
		productService.deleteProduct(id);
	}
	
}