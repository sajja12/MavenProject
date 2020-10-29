package com.cg.fms.dao;

import java.util.List;

import com.cg.fms.dto.Product;

public interface IProductDao {
		
	public boolean  addProduct(Product product);

	public Product getProduct(String productId );
	
	public boolean  UpdateProduct(Product product);
	
	public boolean  deleteProduct(String productId);
	
	public List<Product> getAllProduct();

	

}
