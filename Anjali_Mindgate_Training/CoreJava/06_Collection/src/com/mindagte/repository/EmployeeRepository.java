package com.mindagte.repository;

import java.util.ArrayList;
import java.util.List;

import com.mindgate.pojo.Employee;

public class EmployeeRepository {
	private List<Employee> employees = new ArrayList<>();

	public Boolean addEmployee(Employee employee) {

		// boolean result = employees.add(employee)
		return employees.add(employee);
	}

	public List<Employee> getAll() {

		return employees;

	}
	

//	getone
	public Employee getEmployeeByEmployeeId(int employeeId) {
		for (Employee employee : employees) {
			if (employee.getEmployeeId() ==  employeeId) {
				return employee; 
			}
		}
		
		return null;
		
		
	}
	
//	delete
	public boolean DeleteEmpById(int empId) {
		for (Employee employee : employees) { 
			if(employee.getEmployeeId() == empId) {  
				boolean result = employees.remove(employee);
				return result;
			}
		}
		return false;
		
	}
	
//	update
	public boolean  UpdateEmpDetail(Employee employee ) {
		for (Employee anja : employees) {
			if (anja.getEmployeeId() == employee.getEmployeeId()) {
				employee.setName(employee.getName());
				employee.setSalary(employee.getSalary());
				return true;
			}
		}
		return false;
		
	}
	
}
