package com.cg.fms.service;

import java.util.List;

import com.cg.fms.dto.Contract;

public interface IContractService {
	
	 public boolean  addContract(Contract Contract);

	public Contract getContract(String ContractId);
	
	public boolean  UpdateContract(Contract Contract);
	
	public boolean  deleteContract(String ContractId);
	
	public List<Contract> getAllContract();
}