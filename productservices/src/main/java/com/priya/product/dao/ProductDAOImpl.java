package com.priya.product.dao;

import java.util.HashMap;
import java.util.Map;

import com.priya.product.dto.Product;

public class ProductDAOImpl implements ProductDAO {

	Map<Integer,Product> products = new HashMap<Integer,Product>();

	@Override
	public void create(Product product) {
		products.put(product.getId(), product);
		
	}

	@Override
	public Product read(int id) {
		return products.get(id);
	}

}
