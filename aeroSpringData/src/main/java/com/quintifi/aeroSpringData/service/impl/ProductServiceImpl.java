package com.quintifi.aeroSpringData.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.quintifi.aeroSpringData.domain.Product;
import com.quintifi.aeroSpringData.repository.ProductRepository;
import com.quintifi.aeroSpringData.service.ProductService;

public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> listAllProducts() {
		return (List<Product>) productRepository.findAll();
	}

	@Override
	public Product getProductById(Integer id) {
		return productRepository.findById(id).get();
	}

	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public void deleteProduct(Integer id) {
		productRepository.deleteById(id);
	}

}