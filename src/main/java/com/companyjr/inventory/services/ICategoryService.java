package com.companyjr.inventory.services;

import org.springframework.http.ResponseEntity;

import com.companyjr.inventory.response.CategoryResponseRest;

public interface ICategoryService {
	
	public ResponseEntity<CategoryResponseRest> search();
	public ResponseEntity<CategoryResponseRest> searchById(Long id);

}
