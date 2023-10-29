package com.companyjr.inventory.response;

import java.util.List;

import com.companyjr.inventory.model.Product;

import lombok.Data;

@Data
public class ProductResponse {

	List<Product> products;
}
