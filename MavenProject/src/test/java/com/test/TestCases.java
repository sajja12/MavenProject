package com.test;


	import java.util.ArrayList;
	import java.util.List;

	import org.junit.BeforeClass;
	import org.junit.Test;
	import org.junit.jupiter.api.Assertions;

	import com.cg.fms.dao.IProductDao;
	import com.cg.fms.dao.ProductDao;
	import com.cg.fms.dto.Product;
	public class TestCases {
		static IProductDao adao;
		@BeforeClass
		public static void initialise()
		{
			System.out.println("Inside before class");
			adao=new ProductDao();
		}
		@Test
		public void testAddproduct()
		{
			//assertEquals
			Product productRecord1=new Product("1","wood","2","wood is used for furniture");
			Assertions.assertEquals(true, adao.addProduct(productRecord1)); 
			//assertNotEquals
		
			
		}
		@Test
		public void testUpdateproduct()
		{
				Product productRecord1=new Product("wood","2","wood is used for furniture");
				if(adao.addProduct(productRecord1))
				{
					productRecord1.setProductName("sandal");
					productRecord1.setProductQuantity("3");
					productRecord1.setProductDescription("sandal used for beauty");
					if(adao.UpdateProduct(productRecord1))
					{
						Assertions.assertEquals("sandal", productRecord1.getProductName());
						Assertions.assertEquals("3", productRecord1.getProductQuantity());
						Assertions.assertEquals("sandal used for beauty", productRecord1.getProductDescription());
						Assertions.assertNotEquals("true",productRecord1.getProductName());
					}
				}
				
		}
		@Test
		public void testDeleteproduct()
		{
			String productId="48";
			if(adao.deleteProduct(productId))
					{
						Assertions.assertNotNull(productId);
						Assertions.assertNotEquals(true, adao.deleteProduct(productId));
						
					}
			
		}
		@Test
		public void testGetAllproduct()
		{
			List<Product> list=new ArrayList<Product>();
			Product product1=new Product("1","wood","2","wood is used for furniture");
			Product product2=new Product("2","paper","4","paper is used for ");
			if(adao.addProduct(product1) && adao.addProduct(product2))
			{
				list.add(product1);
				list.add(product2);
			}
			Assertions.assertNotNull(product1);
			Assertions.assertNotNull(product2);
			Assertions.assertNotEquals(list, adao.getAllProduct());
		}

	}

