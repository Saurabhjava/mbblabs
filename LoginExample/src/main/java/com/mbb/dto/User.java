package com.mbb.dto;

public class User {
	private String uid;
	private String name;
	private String password;
	private String email;
	private String role;
	
	public User() {
		
	}
	public User(String name, String password, String email) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
