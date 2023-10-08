package com.companyjr.inventory.response;

import java.util.List;
import com.companyjr.inventory.model.Category;

import lombok.Data;

@Data
public class CategoryResponse {
	private List<Category> Category;

}
