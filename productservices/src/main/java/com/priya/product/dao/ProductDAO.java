package com.priya.product.dao;

import com.priya.product.dto.Product;

public interface ProductDAO {
	void create(Product product);
	
	Product read(int id);

}
