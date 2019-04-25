package com.quintifi.aeroSpringData.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.quintifi.aeroSpringData.domain.Product;

@Service
public interface ProductService{
	
	List<Product> listAllProducts();

	Product getProductById(Integer id);

	Product saveProduct(Product product);

	void deleteProduct(Integer id);
	
}