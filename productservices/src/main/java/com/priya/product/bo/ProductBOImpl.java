package com.priya.product.bo;

import com.priya.product.dao.ProductDAO;
import com.priya.product.dao.ProductDAOImpl;
import com.priya.product.dto.Product;

public class ProductBOImpl implements ProductBO {

	private static ProductDAO dao = new ProductDAOImpl();
	@Override
	public void create(Product product) {
		dao.create(product);
	}
	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	
	}

}
