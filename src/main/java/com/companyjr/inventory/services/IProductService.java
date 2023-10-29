package com.companyjr.inventory.services;

import org.springframework.http.ResponseEntity;

import com.companyjr.inventory.model.Product;
import com.companyjr.inventory.response.ProductResponseRest;

public interface IProductService {

	public ResponseEntity<ProductResponseRest> save(Product product, Long categoryId);
}
