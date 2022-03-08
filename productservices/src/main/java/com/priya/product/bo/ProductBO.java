package com.priya.product.bo;

import com.priya.product.dto.Product;

public interface ProductBO {
	
	void create(Product product);
	
	Product findProduct(int id);
	

}
