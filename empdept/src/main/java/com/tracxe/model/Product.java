package com.tracxe.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id 
	@GeneratedValue(strategy =GenerationType.IDENTITY) 
	private int prodId;
	private String prodName;
	private double price;
	private String compName;
	
	public Product() {
		
	}
	
	public Product(int prodId,String prodName,double price) {
		this.prodId=prodId;
		this.prodName=prodName;
		this.price=price;
	}
	
	public int getProdId() {
		return prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public double getPrice() {
		return price;
	}

	public String getCompName() {
		return compName;
	}

	

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	
	
}
