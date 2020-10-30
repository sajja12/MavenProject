package com.cg.fms.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.cg.fms.dto.Contract;
import com.cg.fms.exceptions.DataNotFoundException;
import com.cg.fms.service.IContractService;
import com.cg.fms.service.ContractService;

public class ContractMain 
{
	static String contractNumber;
	static String deliveryPlace;
	static String deliveryDate;
	static String quantity;
	public static void main(String[] args) throws DataNotFoundException
	{
		 Scanner scanner=new Scanner(System.in);
		 
		 IContractService service=new ContractService();
		 while(true)
		 {
			System.out.println("******************************Contract Services*******************************");
			System.out.println("Enter yor choice");
			System.out.println("1.To add Contract details");
			System.out.println("2.To get  Contract details");
			System.out.println("3.To Update Contract details ");
			System.out.println("4.To delete Contract details");
			System.out.println("5.To get all Contract records");
			System.out.println("****************************************************************************");
			
			int ch=scanner.nextInt();
			switch(ch)
			{

			/*
			 * This function will call the service layer method and service layer calls the Dao layer and return the contract
			 * object which is populated by the information of the given.
			 */
				case 1:
				{
					// Reading and setting the values for the addContract
					System.out.println("enter the contractNumber");
					String contractNumber=scanner.next();
					System.out.println("enter the delivery place ");
					String deliveryPlace=scanner.next();
					System.out.println("enter the delivery date");
					String deliveryDate=scanner.next();
					System.out.println("enter the quantity");
					String quantity=scanner.next();
					Contract p= new Contract(contractNumber, deliveryPlace, deliveryDate, quantity);
					if(service.addContract(p))
					{
						System.out.println("Contract added succesfully");
					}
					else
					{
						throw new DataNotFoundException("Contract not added");
					}
					
				}
				break;
				/*
				 * This function will call the service layer method and service layer calls the Dao layer and return the contract
				 *  details with respect to productId.
				 */
				case 2:
				{
					System.out.println("enter the Contract you want to get ");
					String contractNumber=scanner.next();
					try
					{
						Contract Contract= service.getContract(contractNumber);
						System.out.println("Contract details are");
						System.out.println(Contract);						
					}
					catch(DataNotFoundException e)
					{
						System.out.println(e.getMessage());
						
					}
				
				}
				break;
				/*
				 * This function will call the service layer method and service layer calls the Dao layer and return the contract
				 * details with updated values
				 */
				case 3:
					System.out.println("Enter the id of Contract whose Contract name should be updated");
					contractNumber=scanner.next();
					System.out.println("enter the new deliveryPlace");
					deliveryPlace=scanner.next();
					System.out.println("enter the new deliveryDate");
					deliveryDate=scanner.next();
					System.out.println("enter the new quantity");
					quantity=scanner.next();
					Contract p= new Contract(contractNumber, deliveryPlace, deliveryDate, quantity);
					
					if(service.UpdateContract(p))
					{
						System.out.println("Contract details are  updated succesfully");
					}
				
					else
					{
						throw new DataNotFoundException(" Contract's id,Contract name are  not updated!"); 
					}
					break;
					/*
					 * This function will call the service layer method and service layer calls the Dao layer and return the 
					 * deleted contract.
					 */
				case 4:
					System.out.println("Enter the id  that you want to delete:");
					String contractNumber=scanner.next();
					try {
						System.out.println(service.deleteContract(contractNumber));
						System.out.println("Contract deleted successfully");
					}
					catch(DataNotFoundException e)
					{
						System.out.println(e.getMessage());
					}
					break;
					/*
					 * This function will call the service layer method and service layer calls the Dao layer and return the 
					 * list of all contracts present in the database.
					 */
				case 5:
					List<Contract> list=service.getAllContract();
					 Iterator<Contract> iterator=list.iterator();
					 while(iterator.hasNext())
					 {
						Contract record=(Contract) iterator.next();
						System.out.println(record);
					 }
					 break;
				case 6:
					return;
				default:
					System.out.println("Enter a valid option[1-6]");			
					
				
				}
				
			}
			
		}
	}





