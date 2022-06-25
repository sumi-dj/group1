package com.demo.project.entities;

public class AuthRequest {
	private Integer id;
	private String password;
	public AuthRequest(Integer id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	
	public AuthRequest() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AuthRequest [id=" + id + ", password=" + password + "]";
	}
	
}
