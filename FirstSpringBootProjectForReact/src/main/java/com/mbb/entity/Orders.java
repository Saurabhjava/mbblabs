package com.mbb.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int oid;
	private String prodName;
	private double price;
	
	public Orders() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Orders [oid=" + oid + ", prodName=" + prodName + ", price=" + price + "]";
	}
	public Orders(String prodName, double price) {
		super();
		this.prodName = prodName;
		this.price = price;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
