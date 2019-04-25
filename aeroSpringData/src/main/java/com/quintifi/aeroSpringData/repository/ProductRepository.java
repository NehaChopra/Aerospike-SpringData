package com.quintifi.aeroSpringData.repository;

import org.springframework.data.aerospike.repository.AerospikeRepository;

import com.quintifi.aeroSpringData.domain.Product;

public interface ProductRepository extends AerospikeRepository<Product, Integer>{
	
}