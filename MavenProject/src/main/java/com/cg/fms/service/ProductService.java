package com.cg.fms.service;

import java.util.List;
import com.cg.fms.dao.IProductDao;
import com.cg.fms.dao.ProductDao;
import com.cg.fms.dto.Product;

public class ProductService implements IProductService
{
	IProductDao dao=new ProductDao();
	
	public boolean addProduct(Product product) 
	{
		if(dao.addProduct(product))
			return true;
		else
			return false;
	}
	
	public Product getProduct(String productId) 
	{
		return dao.getProduct(productId);

	}
	
	
	public boolean UpdateProduct(Product product) 
	{
		if(dao.UpdateProduct(product)) 
			return true;
		else
			return false;
	}
	
	
	public boolean deleteProduct(String productId) 
	{
		if(dao.deleteProduct(productId))
			return true;
		else
			return false;
	}
	
	
	public List<Product> getAllProduct() 
	{
		return dao.getAllProduct();
	}

	
}

