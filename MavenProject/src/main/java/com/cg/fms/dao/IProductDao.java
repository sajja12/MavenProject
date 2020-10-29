package com.cg.fms.dao;

import java.util.List;
import com.cg.fms.dto.Product;

public interface IProductDao {
		
	//------------------------ 1. Product Application --------------------------
			/*******************************************************************************************************
			 - Function Name	:	addProduct(Product product) 
			 - Input Parameters	:	Product product
			 - Return Type		:	boolean
			 - Author			:	Lavanya
			 - Creation Date	:	28/10/2020
			 - Description		:	Adding Products into the database
			 ********************************************************************************************************/
	public boolean  addProduct(Product product);

	//------------------------ 1. Product Application --------------------------
	/*******************************************************************************************************
	 - Function Name	:	UpdateProduct(Product product) 
	 - Input Parameters	:	Product product
	 - Return Type		:	boolean
	 - Author			:	Lavanya
	 - Creation Date	:	28/10/2020
	 - Description		:	getting Products the details
	 ********************************************************************************************************/
	public Product getProduct(String productId );
	//------------------------ 1. Product Application --------------------------
	/*******************************************************************************************************
	 - Function Name	:	UpdateProduct(Product product) 
	 - Input Parameters	:	Product product
	 - Return Type		:	boolean
	 - Author			:	Lavanya
	 - Creation Date	:	28/10/2020
	 - Description		:	updating the Products details
	 ********************************************************************************************************/
	
	public boolean  UpdateProduct(Product product);
	
	//------------------------ 1. Product Application --------------------------
	/*******************************************************************************************************
	 - Function Name	:	deleteProduct(String productId) 
	 - Input Parameters	:	String productId
	 - Return Type		:	boolean
	 - throw			:	DataNotFoundException
	 - Author			:	Lavanya
	 - Creation Date	:	28/10/2020
	 - Description		:	deleting Products
	 ********************************************************************************************************/
	public boolean  deleteProduct(String productId);
	
	
	//------------------------ 1. Product Application --------------------------
	/*******************************************************************************************************
	 - Function Name	:	getAllProduct() 
	 - Input Parameters	:	No
	 - Return Type		:	List<Product>
	 - Author			:	Lavanya
	 - Creation Date	:	28/10/2020
	 - Description		:	Getting all the Products presen in the database
	 ********************************************************************************************************/
	
	
	public List<Product> getAllProduct();

	

}
