package com.cg.fms.dao;

import java.util.List;

import com.cg.fms.dto.Contract;

public interface IContractDao {
	
	//------------------------ 1. Contract Application --------------------------
			/*******************************************************************************************************
			 - Function Name	:	addContract(Contract contract)
			 - Input Parameters	:	Contract contract
			 - Return Type		:	boolean
			 - Author			:	Lavanya
			 - Creation Date	:	28/10/2020
			 - Description		:	Adding contract details into the database
			 ********************************************************************************************************/
		
	public boolean  addContract(Contract contract);
	//------------------------ 1. Contract Application --------------------------
		/*******************************************************************************************************
				- Function Name	:	getContract(Contract contract)
			 - Input Parameters	:	String contractId
			 - Return Type		:	Contract
			 - Author			:	Lavanya
			 - Creation Date	:	28/10/2020
			 - Description		:	getting contract details into the database
		 ********************************************************************************************************/

	public Contract getContract(String contractId );
	//------------------------ 1. Contract Application --------------------------
		/*******************************************************************************************************
		 - Function Name	:	UpdateContract(Contract contract)
		 - Input Parameters	:	Contract contract
		 - Return Type		:	boolean
		 - Author			:	Lavanya
		 - Creation Date	:	28/10/2020
		 - Description		:	updating the contract details
		 ********************************************************************************************************/
		
	public boolean  UpdateContract(Contract contract);
	//------------------------ 1. Contract Application --------------------------
		/*******************************************************************************************************
		 - Function Name	:	deleteProduct(String ContractId) 
		 - Input Parameters	:	String ContractId
		 - Return Type		:	boolean
		 - throw			:	DataNotFoundException
		 - Author			:	Lavanya
		 - Creation Date	:	28/10/2020
		 - Description		:	deleting contract
		 ********************************************************************************************************/
	
	public boolean  deleteContract(String contractId);
	//------------------------ 1. Contract Application --------------------------
		/*******************************************************************************************************
		 - Function Name	:	getAllContract() 
		 - Input Parameters	:	No
		 - Return Type		:	List<contract>
		 - Author			:	Lavanya
		 - Creation Date	:	28/10/2020
		 - Description		:	Getting all the contracts present in the database
		 ********************************************************************************************************/
	
	public List<Contract> getAllContract();

	

}
