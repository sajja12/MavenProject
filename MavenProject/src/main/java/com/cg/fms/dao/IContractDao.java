package com.cg.fms.dao;

import java.util.List;

import com.cg.fms.dto.Contract;

public interface IContractDao {
		
	public boolean  addContract(Contract contract);

	public Contract getContract(String contractId );
	
	public boolean  UpdateContract(Contract contract);
	
	public boolean  deleteContract(String contractId);
	
	public List<Contract> getAllContract();

	

}
