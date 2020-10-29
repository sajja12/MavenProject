package com.cg.fms.service;

import java.util.List;

import com.cg.fms.dao.IContractDao;
import com.cg.fms.dao.ContractDao;
import com.cg.fms.dto.Contract;

public class ContractService implements IContractService{
	IContractDao dao=new ContractDao();
	
	public boolean addContract(Contract Contract) {
		// TODO Auto-generated method stub
		if(dao.addContract(Contract)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public Contract getContract(String contractNumber) {
		return dao.getContract(contractNumber);

	}

	@Override
	public boolean UpdateContract(Contract Contract) {
		if(dao.UpdateContract(Contract)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean deleteContract(String contractNumber) {
		if(dao.deleteContract(contractNumber)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public List<Contract> getAllContract() {
		return dao.getAllContract();
	}

	
}

