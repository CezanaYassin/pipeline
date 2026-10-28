package com.optimization.request;

public class EmployeeRequest {
	
	private String name;
	
	private String email;

	public EmployeeRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeRequest(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
