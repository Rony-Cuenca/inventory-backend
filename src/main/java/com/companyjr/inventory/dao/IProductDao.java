package com.companyjr.inventory.dao;

import org.springframework.data.repository.CrudRepository;

import com.companyjr.inventory.model.Product;

public interface IProductDao extends CrudRepository<Product, Long>{

}
