package com.cg.fms.service;

import java.util.List;

import com.cg.fms.dto.Contract;

public interface IContractService {
	//------------------------ 1. Contract Service --------------------------
	/*******************************************************************************************************
	 - Function Name	:	addContract(Contract Contract)
	 - Input Parameters	:	Contract Contract
	 - Return Type		:	boolean
	 - Author			:	Lavanya
	 - Creation Date	:	29/10/2020
	 - Description		:	adding Contract details to database calls dao method addContract(Contract Contract)
	 ********************************************************************************************************/
	 public boolean  addContract(Contract Contract);
	//------------------------ 1. Contract Service --------------------------
		/*******************************************************************************************************
		 - Function Name	:	addContract(String ContractId)
		 - Input Parameters	:	String ContractId
		 - Return Type		:	Contract
		 - Author			:	Lavanya
		 - Creation Date	:	29/10/2020
		 - Description		:	getting Contract details to database calls dao method getContract(String ContractId)
		 ********************************************************************************************************/
	public Contract getContract(String ContractId);
	//------------------------ 1. Contract Service --------------------------
			/*******************************************************************************************************
			 - Function Name	:	UpdateContract(Contract Contract)
			 - Input Parameters	:	Contract Contract
			 - Return Type		:	boolean
			 - Author			:	Lavanya
			 - Creation Date	:	29/10/2020
			 - Description		:	updating Contract details to database calls dao method UpdateContract(Contract Contract)
			 ********************************************************************************************************/
	public boolean  UpdateContract(Contract Contract);
	/*******************************************************************************************************
	 - Function Name	:	deleteContract(String ContractId)
	 - Input Parameters	:	String ContractId
	 - Return Type		:	boolean
	 - Author			:	Lavanya
	 - Creation Date	:	29/10/2020
	 - Description		:	updating Contract details to database calls dao method deleteContract(String ContractId)
	 ********************************************************************************************************/
	public boolean  deleteContract(String ContractId);
	/*******************************************************************************************************
	 - Function Name	:	getAllContract()
	 - Return Type		:	List<Contract> 
	 - Author			:	Lavanya
	 - Creation Date	:	29/10/2020
	 - Description		:	getting Contract details in database calls dao method getAllContract()
	 ********************************************************************************************************/
	public List<Contract> getAllContract();
}