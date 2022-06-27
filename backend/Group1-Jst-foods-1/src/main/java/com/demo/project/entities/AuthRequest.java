package com.demo.project.entities;

public class AuthRequest {
	private String name;
	private String password;
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
	@Override
	public String toString() {
		return "AuthRequest [name=" + name + ", password=" + password + "]";
	}
	public AuthRequest(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public AuthRequest() {
		super();
	}
	
}