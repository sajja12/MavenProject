package com.cg.fms.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.fms.dto.Product;
import com.cg.fms.exceptions.DataNotFoundException;

import com.cg.fms.service.ProductService;

import com.cg.fms.utility.Connection;


public class ProductDao implements IProductDao 
{

	EntityManagerFactory factory=null;
	EntityManager manager=null;
	EntityTransaction transaction=null;
	//------------------------ 1. Product Application --------------------------
		/*******************************************************************************************************
		 - Function Name	:	addProduct(Product product) 
		 - Input Parameters	:	Product product
		 - Return Type		:	boolean
		 - Author			:	Lavanya
		 - Creation Date	:	28/10/2020
		 - Description		:	Adding Products
		 ********************************************************************************************************/
	
	public boolean  addProduct(Product product) 
	{
		factory = Connection.getFactory();
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
		if(product!=null) 
		{
			transaction.begin();
			manager.persist(product);
			transaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}
	//------------------------ 1. Product Application --------------------------
			/*******************************************************************************************************
			 - Function Name	:	getProduct(String productId) 
			 - Input Parameters	:	String productId
			 - Return Type		:	Product
			 - throw			:	DataNotFoundException
			 - Author			:	Lavanya
			 - Creation Date	:	28/10/2020
			 - Description		:	Getting Product details
			 ********************************************************************************************************/
	public Product getProduct(String productId) 
	{
		factory = Connection.getFactory();
		manager = factory.createEntityManager();
		Product product=manager.find(Product.class, productId);
		if(product==null)
		{
			throw new DataNotFoundException("Product is not found with given id");
		}
		return product;
	}

	//------------------------ 1. Product Application --------------------------
			/*******************************************************************************************************
			 - Function Name	:	UpdateProduct(Product product) 
			 - Input Parameters	:	Product product
			 - Return Type		:	boolean
			 - Author			:	Lavanya
			 - Creation Date	:	28/10/2020
			 - Description		:	Adding Products
			 ********************************************************************************************************/
	public boolean  UpdateProduct(Product product) 
	{
		factory = Connection.getFactory();
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
		Product productRecord = manager.find(Product.class,product.productId);
	
		if (productRecord!= null)
		{
			transaction.begin();
			productRecord.setProductName(product.productName);
			productRecord.setProductQuantity(product.productQuantity);
			productRecord.setProductDescription(product.productDescription);
			transaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

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
	public boolean  deleteProduct(String productId) 
	{
		factory=Connection.getFactory();
		manager= factory.createEntityManager();
		transaction = manager.getTransaction();
		Product product=manager.find(Product.class,productId);
		 if(product==null)
		 {
			 throw new DataNotFoundException("Product is not found with the given Id");
		 }
		 else
		 {
			 transaction.begin();
			 manager.remove(product);
			 transaction.commit();
		 }
		return true;
	}
	//------------------------ 1. Product Application --------------------------
			/*******************************************************************************************************
			 - Function Name	:	getAllProduct() 
			 - Input Parameters	:	No
			 - Return Type		:	List<Product>
			 - Author			:	Lavanya
			 - Creation Date	:	28/10/2020
			 - Description		:	Getting all the Products
			 ********************************************************************************************************/
	
	public List<Product> getAllProduct() {
		factory = Connection.getFactory();
		manager = factory.createEntityManager();
		String selectQuery ="Select e from Product e ";
		Query query=manager.createQuery(selectQuery);
		List<Product> list=query.getResultList();
		
		return list;
	}

	
	
}
