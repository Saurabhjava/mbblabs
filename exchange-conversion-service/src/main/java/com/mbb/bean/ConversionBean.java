package com.mbb.bean;

public class ConversionBean {
	private String from;
	private String to;
	private int exchangeValue;
	private int qty;
	private int totalValue;
	private int port;
	
	public ConversionBean(String from, String to, int exchangeValue, int qty, int totalValue, int port) {
		super();
		this.from = from;
		this.to = to;
		this.exchangeValue = exchangeValue;
		this.qty = qty;
		this.totalValue = totalValue;
		this.port = port;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public int getExchangeValue() {
		return exchangeValue;
	}
	public void setExchangeValue(int exchangeValue) {
		this.exchangeValue = exchangeValue;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(int totalValue) {
		this.totalValue = totalValue;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	
}
