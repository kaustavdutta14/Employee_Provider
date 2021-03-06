package com.java.domain;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private static final long serialVersionUID = -7244720895070176021L;
	
	private int id;
	private String name;
	private String address;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	public Employee() {
		
	}
	
	public Employee(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
