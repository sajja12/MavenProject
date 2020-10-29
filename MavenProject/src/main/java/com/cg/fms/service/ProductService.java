package com.cg.fms.service;

import java.util.List;

import com.cg.fms.dao.IProductDao;
import com.cg.fms.dao.ProductDao;
import com.cg.fms.dto.Product;

public class ProductService implements IProductService{
	IProductDao dao=new ProductDao();
	//------------------------ 1. Donor Application --------------------------
		/*******************************************************************************************************
		 - Function Name	:	addProduct
		 - Input Parameters	:	product object
		 - Return Type		:	Product
		 - Author			:	Lavanya
		 - Creation Date	:	29/10/2020
		 - Description		:	adding product details to database calls dao method addProduct(Product product)
		 ********************************************************************************************************/
	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		if(dao.addProduct(product)) {
			return true;
		}
		else {
			return false;
		}
	}
	//------------------------ 1. Donor Application --------------------------
		/*******************************************************************************************************
		 -- Function Name	:	getProduct
		 - Input Parameters	:	String productId
		 - Return Type		:	String
		 - Author			:	Lavanya
		 - Creation Date	:	29/10/2020
		 - Description		:	getting product details in database calls dao method getProduct(String productId)
		 ********************************************************************************************************/
	@Override
	public Product getProduct(String productId) {
		return dao.getProduct(productId);

	}
	//------------------------ 1. Donor Application --------------------------
		/*******************************************************************************************************
		 - Function Name	:	UpdateProduct
		 - Input Parameters	:	product object
		 - Return Type		:	Product
		 - Author			:	Lavanya
		 - Creation Date	:	29/10/2020
		 - Description		:	updating product details to database calls dao method UpdateProduct(Product product)
		 ********************************************************************************************************/
	@Override
	public boolean UpdateProduct(Product product) {
		if(dao.UpdateProduct(product)) {
			return true;
		}
		else {
			return false;
		}
	}
	//------------------------ 1. Donor Application --------------------------
		/*******************************************************************************************************
		 - Function Name	:	deleteProduct
		 - Input Parameters	:	String productId
		 - Return Type		:	String
		 - Author			:	Lavanya
		 - Creation Date	:	29/10/2020
		 - Description		:	deleting product details to database calls dao method deleteProduct(String productId)
		 ********************************************************************************************************/
	@Override
	public boolean deleteProduct(String productId) {
		if(dao.deleteProduct(productId)) {
			return true;
		}
		else {
			return false;
		}
	}
	//------------------------ 1. Donor Application --------------------------
		/*******************************************************************************************************
		 -- Function Name	:	getAllProduct
		 - Return Type		:	List<Product>
		 - Author			:	Lavanya
		 - Creation Date	:	29/10/2020
		 - Description		:	getting all the product details in database calls dao method getAllProduct()
		 ********************************************************************************************************/
	@Override
	public List<Product> getAllProduct() {
		return dao.getAllProduct();
	}

	
}

