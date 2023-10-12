package com.companyjr.inventory.services;

import org.springframework.http.ResponseEntity;

import com.companyjr.inventory.model.Category;
import com.companyjr.inventory.response.CategoryResponseRest;

public interface ICategoryService {
	
	public ResponseEntity<CategoryResponseRest> search();
	public ResponseEntity<CategoryResponseRest> searchById(Long id);
	public ResponseEntity<CategoryResponseRest> save(Category category);
	public ResponseEntity<CategoryResponseRest> update(Category category, Long id);

}
