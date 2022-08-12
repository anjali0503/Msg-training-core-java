package com.mindgate.pojo;

public class Emp {
	private int EmpId;
	private String name;
	private double salary;

	public Emp() {
		// TODO Auto-generated constructor stub
	}

	public Emp(int empId, String name, double salary) {
		super();
		EmpId = empId;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
