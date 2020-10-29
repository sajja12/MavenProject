package com.cg.fms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Products_Details")
public class Product {
	@Id
	
	@Column(name="Product_id")	
	public String productId;
	
	@Column(name="Product_Name")
	public String productName;
	
	@Column(name="Product_quantity")
	public String productQuantity;
	
	@Column(name="Product_Description")
	public String productDescription;	
	
//	@OneToOne
//	private Contract contract;
//	
//	
//	public Contract getContract() {
//		return contract;
//	}
//	public void setContract(Contract contract) {
//		this.contract = contract;
//	}
	public Product() {
		
	}
	public Product(String productId, String productName, String productQuantity, String productDescription) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productDescription = productDescription;
	}
	
	public Product(String productName, String productQuantity, String productDescription) {
		super();
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productDescription = productDescription;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(String productQuantity) {
		this.productQuantity = productQuantity;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productQuantity="
				+ productQuantity + ", productDescription=" + productDescription + "]";
	}
	
}
