package com.cg.fms.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import com.cg.fms.dto.Product;
import com.cg.fms.exceptions.DataNotFoundException;
import com.cg.fms.utility.Connection;


public class ProductDao implements IProductDao 
{

	EntityManagerFactory factory=null;
	EntityManager manager=null;
	EntityTransaction transaction=null;
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
			return false;
	}
	
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
			return false;
	}

	
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
	
	
	public List<Product> getAllProduct() {
		factory = Connection.getFactory();
		manager = factory.createEntityManager();
		String selectQuery ="Select e from Product e ";
		Query query=manager.createQuery(selectQuery);
		List<Product> list=query.getResultList();
		
		return list;
	}

	
	
}
