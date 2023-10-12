package com.companyjr.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.companyjr.inventory.model.Category;
import com.companyjr.inventory.response.CategoryResponseRest;
import com.companyjr.inventory.services.ICategoryService;
//PERMITIR CONSUMIR EL SERVICIO ANGULAR CON CROSS ORIGIN
@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api/v1")
public class CategoryRestController {
	
	@Autowired
	private ICategoryService service;
	
	/**
	 * 
	 * @return
	 */
	/*get all the categories*/
	@GetMapping("/categories")
	public ResponseEntity<CategoryResponseRest> searchCategories(){
		ResponseEntity<CategoryResponseRest> response =  service.search();
		return response;
	}
	/**
	 * 
	 * @param id
	 * @return
	 */
	/*get categories by id*/
	@GetMapping("/categories/{id}")
	public ResponseEntity<CategoryResponseRest> searchCategoriesById(@PathVariable Long id){
		ResponseEntity<CategoryResponseRest> response =  service.searchById(id);
		return response;
	}
	/**
	 * 
	 * @param category
	 * @return
	 */
	/*save categories by id*/
	@PostMapping("/categories")
	public ResponseEntity<CategoryResponseRest> save(@RequestBody Category category){
		ResponseEntity<CategoryResponseRest> response =  service.save(category);
		return response;
	}
	/**
	 * 
	 * @param category
	 * @param id
	 * @return
	 */
	/*update categories*/
	@PutMapping("/categories/{id}")
	public ResponseEntity<CategoryResponseRest> update(@RequestBody Category category, @PathVariable Long id){
		ResponseEntity<CategoryResponseRest> response =  service.update(category, id);
		return response;
	}
	/**
	 * 
	 * @param id
	 * @return
	 */
	/*delete categories*/
	@DeleteMapping("/categories/{id}")
	public ResponseEntity<CategoryResponseRest> delete(@PathVariable Long id){
		ResponseEntity<CategoryResponseRest> response =  service.deleteById(id);
		return response;
	}

}
