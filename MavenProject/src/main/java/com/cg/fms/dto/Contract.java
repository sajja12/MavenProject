package com.cg.fms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="contracts_Details")
public class Contract {
	@Id
	@Column(name="contract_id")
	
	public String contractNumber;
	
	@Column(name="contract_Name")
	public String deliveryPlace;
	
	@Column(name="contract_quantity")
	public String quantity;
	
	@Column(name="contract_Description")
	public String deliveryDate;	
	
	public Contract() {
		
	}
	public Contract(String contractNumber, String deliveryPlace, String quantity, String deliveryDate) {
		super();
		this.contractNumber = contractNumber;
		this.deliveryPlace = deliveryPlace;
		this.quantity = quantity;
		this.deliveryDate = deliveryDate;
	}
	
	public String getcontractNumber() {
		return contractNumber;
	}
	public void setcontractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}
	public String getdeliveryPlace() {
		return deliveryPlace;
	}
	public void setdeliveryPlace(String deliveryPlace) {
		this.deliveryPlace = deliveryPlace;
	}
	public String getquantity() {
		return quantity;
	}
	public void setquantity(String quantity) {
		this.quantity = quantity;
	}
	public String getdeliveryDate() {
		return deliveryDate;
	}
	public void setdeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	
	public String toString() {
		return "contract [contractNumber=" + contractNumber + ", deliveryPlace=" + deliveryPlace + ", quantity="
				+ quantity + ", deliveryDate=" + deliveryDate + "]";
	}
	
}
