package com.moehtet.doma2.entity;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;

@Entity
public class Employee {
	
	@Id
	private Integer employeeId;
	
	private String employeeName;
	
	private String address;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
