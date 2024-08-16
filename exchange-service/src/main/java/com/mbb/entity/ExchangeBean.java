package com.mbb.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "exchangetable")
public class ExchangeBean {
	@Id
	private int exchangeId;
	@Column(name="currency_from")
	private String from;
	@Column(name="currency_to")
	private String to;
	private int exchangeValue;
	@Transient
	private int port;
	public int getExchangeId() {
		return exchangeId;
	}
	public void setExchangeId(int exchangeId) {
		this.exchangeId = exchangeId;
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
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	
}
