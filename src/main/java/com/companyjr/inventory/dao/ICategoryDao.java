package com.companyjr.inventory.dao;

import org.springframework.data.repository.CrudRepository;

import com.companyjr.inventory.model.Category;

public interface ICategoryDao extends CrudRepository<Category, Long>{

}
