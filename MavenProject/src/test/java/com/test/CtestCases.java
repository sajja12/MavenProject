package com.test;
	import java.util.ArrayList;
	import java.util.List;

	import org.junit.BeforeClass;
	import org.junit.Test;
	import org.junit.jupiter.api.Assertions;

import com.cg.fms.dao.ContractDao;
import com.cg.fms.dao.IContractDao;
import com.cg.fms.dto.Contract;

	
	public class CtestCases {
		static IContractDao adao;
		@BeforeClass
		public static void initialise()
		{
			System.out.println("Inside before class");
			adao=new ContractDao();
		}
		@Test
		public void testAddContract()
		{
			//assertEquals
			Contract ContractRecord1=new Contract("1","Hyderabad","1/11/2020","2");
			Assertions.assertEquals(true, adao.addContract(ContractRecord1)); 
			//assertNotEquals
		
			
		}
		@Test
		public void testUpdateContract()
		{
				Contract ContractRecord1=new Contract("1","Hyderabad","1/11/2020","2");
				if(adao.addContract(ContractRecord1))
				{
					ContractRecord1.setdeliveryPlace("mumbai");
					ContractRecord1.setdeliveryDate("2/11/2020");
					ContractRecord1.setquantity("4");
					if(adao.UpdateContract(ContractRecord1))
					{
						Assertions.assertEquals("sandal", ContractRecord1.getdeliveryPlace());
						Assertions.assertEquals("3", ContractRecord1.getdeliveryDate());
						Assertions.assertEquals("sandal used for beauty", ContractRecord1.getquantity());
						Assertions.assertNotEquals("true",ContractRecord1.getdeliveryPlace());
						Assertions.assertNotEquals("true",ContractRecord1.getdeliveryDate());
						Assertions.assertNotEquals("true",ContractRecord1.getquantity());
					}
				}
				
		}
		@Test
		public void testDeleteContract()
		{
			String ContractId="48";
			if(adao.deleteContract(ContractId))
					{
						Assertions.assertNotNull(ContractId);
						Assertions.assertNotEquals(true, adao.deleteContract(ContractId));
						
					}
			
		}
		@Test
		public void testGetAllContract()
		{
			List<Contract> list=new ArrayList<Contract>();
			Contract Contract1=new Contract("1","Hyderabad","1/11/2020","2");
			Contract Contract2=new Contract("2","mumbai","2/11/2020","4");
			if(adao.addContract(Contract1) && adao.addContract(Contract2))
			{
				list.add(Contract1);
				list.add(Contract2);
			}
			Assertions.assertNotNull(Contract1);
			Assertions.assertNotNull(Contract2);
			Assertions.assertNotEquals(list, adao.getAllContract());
		}

	}