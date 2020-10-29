package com.cg.fms.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.cg.fms.dto.Product;
import com.cg.fms.exceptions.DataNotFoundException;
import com.cg.fms.service.IProductService;
import com.cg.fms.service.ProductService;

public class ProductMain 
{
	static String productId;
	static String productName;
	static String productQuantity;
	static String productDescription;
	public static void main(String[] args) throws DataNotFoundException
	{
		 Scanner scanner=new Scanner(System.in);
		 
		 IProductService service=new ProductService();
		 while(true)
		 {
			System.out.println("******************************Product Services*******************************");
			System.out.println("Enter yor choice");
			System.out.println("1.To add product details");
			System.out.println("2.To get  product details");
			System.out.println("3.To Update product details ");
			System.out.println("4.To delete product details");
			System.out.println("5.To get all product records");
			System.out.println("6.exit");
			System.out.println("****************************************************************************");
			
			int ch=scanner.nextInt();
			switch(ch)
			{
			/*
			 * This function will call the service layer method and service layer calls the Dao layer and return the product
			 * object which is populated by the information of the given.
			 */
				case 1:
				{
					// Reading and setting the values for the addproduct
					System.out.println("enter the productId");
					String productId=scanner.next();
					System.out.println("enter the product name ");
					String productName=scanner.next();
					System.out.println("enter the product Quantity");
					String productQuantity=scanner.next();
					System.out.println("enter the product Description");
					String productDescription=scanner.next();
					 productDescription+=scanner.nextLine();
					Product p= new Product(productId, productName, productQuantity, productDescription);
					if(service.addProduct(p))
					{
						System.out.println("Product added succesfully");
					}
					else
					{
						throw new DataNotFoundException("Product not added");
					}
					
				}
				break;
				/*
				 * This function will call the service layer method and service layer calls the Dao layer and return the product
				 *  details with respect to productId.
				 */
				case 2:
				{
					System.out.println("enter the product you want to get ");
					String productId=scanner.next();
					try
					{
						Product product= service.getProduct(productId);
						System.out.println("Product details are");
						System.out.println(product);						
					}
					catch(DataNotFoundException e)
					{
						System.out.println(e.getMessage());
						
					}
				
				}
				break;
				/*
				 * This function will call the service layer method and service layer calls the Dao layer and return the product
				 * details with updated values
				 */
				case 3:
					System.out.println("Enter the id of product whose product name should be updated");
					productId=scanner.next();
					System.out.println("enter the new productname");
					productName=scanner.next();
					System.out.println("enter the new productQuantity");
					productQuantity=scanner.next();
					String productDescription=scanner.nextLine();
					productDescription += scanner.nextLine();
	                
					Product p= new Product(productId, productName, productQuantity, productDescription);
					
					if(service.UpdateProduct(p))
					{
						System.out.println("product details are  updated succesfully");
					}
				
					else
					{
						throw new DataNotFoundException(" product's id,product name are  not updated!"); 
					}
					break;
					/*
					 * This function will call the service layer method and service layer calls the Dao layer and return the 
					 * deleted product.
					 */
				case 4:
					System.out.println("Enter the id  that you want to delete:");
					String productId=scanner.next();
					try {
						System.out.println(service.deleteProduct(productId));
						System.out.println("Product deleted successfully");
					}
					catch(DataNotFoundException e)
					{
						System.out.println(e.getMessage());
					}
					break;
					/*
					 * This function will call the service layer method and service layer calls the Dao layer and return the 
					 * list of all products present in the database.
					 */
				case 5:
					List<Product> list=service.getAllProduct();
					 Iterator<Product> iterator=list.iterator();
					 while(iterator.hasNext())
					 {
						Product record=(Product) iterator.next();
						System.out.println(record);
					 }
					 break;
				case 6:
					return;
				default:
					System.out.println("Enter a valid option[1-5]");			
					}
				
			}
			
		}
	}

