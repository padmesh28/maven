package com.padmesh.product.bo;

import com.padmesh.product.dto.Product;

public interface ProductBO {
	public void create(Product product);
	
	public Product findProduct (int id);
	

}
