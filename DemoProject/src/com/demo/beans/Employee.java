package com.demo.beans;

import java.io.Serializable;

public class Employee implements Serializable {

	
	
	private static final long serialVersionUID = 1L;
	
	private String empId;
	private String empName;
	private Integer empSalary;
	
	public Employee() {
	}

	public Employee(String empId, String empName, Integer empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Integer empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	
	
	
}
