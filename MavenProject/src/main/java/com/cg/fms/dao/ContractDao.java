package com.cg.fms.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.fms.dto.Contract;
import com.cg.fms.exceptions.DataNotFoundException;

import com.cg.fms.service.ContractService;

import com.cg.fms.utility.Connection;


public class ContractDao implements IContractDao 
{

	EntityManagerFactory factory=null;
	EntityManager manager=null;
	EntityTransaction transaction=null;
	
	
	public boolean  addContract(Contract Contract) 
	{
		factory = Connection.getFactory();
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
		if(Contract!=null) 
		{
			transaction.begin();
			manager.persist(Contract);
			transaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}
	public Contract getContract(String contractNumber) 
	{
		factory = Connection.getFactory();
		manager = factory.createEntityManager();
		Contract Contract=manager.find(Contract.class, contractNumber);
		if(Contract==null)
		{
			throw new DataNotFoundException("Contract is not found with given id");
		}
		return Contract;
	}

	public boolean  UpdateContract(Contract Contract) 
	{
		factory = Connection.getFactory();
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
		Contract ContractRecord = manager.find(Contract.class,Contract.contractNumber);
	
		if (ContractRecord!= null)
		{
			transaction.begin();
			ContractRecord.setdeliveryPlace(Contract.deliveryPlace);
			
			transaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean  deleteContract(String contractNumber) 
	{
		factory=Connection.getFactory();
		manager= factory.createEntityManager();
		transaction = manager.getTransaction();
		Contract Contract=manager.find(Contract.class,contractNumber);
		 if(Contract==null)
		 {
			 throw new DataNotFoundException("Contract is not found with the given Id");
		 }
		 else
		 {
			 transaction.begin();
			 manager.remove(Contract);
			 transaction.commit();
		 }
		return true;
	}
	
	public List<Contract> getAllContract() {
		factory = Connection.getFactory();
		manager = factory.createEntityManager();
		String selectQuery ="Select e from Contract e ";
		Query query=manager.createQuery(selectQuery);
		List<Contract> list=query.getResultList();
		
		return list;
	}

	
	
}
