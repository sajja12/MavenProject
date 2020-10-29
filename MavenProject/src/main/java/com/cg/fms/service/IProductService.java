package com.cg.fms.service;

import java.util.List;
import com.cg.fms.dto.Product;

public interface IProductService {
	
	//------------------------ 1. Product Service --------------------------
			/*******************************************************************************************************
			 - Function Name	:	addProduct
			 - Input Parameters	:	product object
			 - Return Type		:	Product
			 - Author			:	Lavanya
			 - Creation Date	:	29/10/2020
			 - Description		:	adding product details to database calls dao method addProduct(Product product)
			 ********************************************************************************************************/
	public boolean  addProduct(Product product);
	
	
	//------------------------ 1. Product Service--------------------------
			/*******************************************************************************************************
			 -- Function Name	:	getProduct
			 - Input Parameters	:	String productId
			 - Return Type		:	String
			 - Author			:	Lavanya
			 - Creation Date	:	29/10/2020
			 - Description		:	getting product details in database calls dao method getProduct(String productId)
			 ********************************************************************************************************/
	public Product getProduct(String productId);
	
	
	//------------------------ 1. Product Service --------------------------
			/*******************************************************************************************************
			 - Function Name	:	UpdateProduct
			 - Input Parameters	:	product object
			 - Return Type		:	Product
			 - Author			:	Lavanya
			 - Creation Date	:	29/10/2020
			 - Description		:	updating product details to database calls dao method UpdateProduct(Product product)
			 ********************************************************************************************************/
	public boolean  UpdateProduct(Product product);
	
	//------------------------ 1. Product Service--------------------------
			/*******************************************************************************************************
			 - Function Name	:	deleteProduct
			 - Input Parameters	:	String productId
			 - Return Type		:	String
			 - Author			:	Lavanya
			 - Creation Date	:	29/10/2020
			 - Description		:	deleting product details to database calls dao method deleteProduct(String productId)
			 ********************************************************************************************************/
	
	public boolean  deleteProduct(String productId);
	
	
	//------------------------ 1. Product Service --------------------------
			/*******************************************************************************************************
			 -- Function Name	:	getAllProduct
			 - Return Type		:	List<Product>
			 - Author			:	Lavanya
			 - Creation Date	:	29/10/2020
			 - Description		:	getting all the product details in database calls dao method getAllProduct()
			 ********************************************************************************************************/
	public List<Product> getAllProduct();
}