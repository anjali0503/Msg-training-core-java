package com.mindgate.main;

import java.util.List;

import com.mindagte.repository.EmployeeRepository;
import com.mindgate.pojo.Employee;

public class EmployeeRespositoryMain {
	public static void main(String[] args) {
		EmployeeRepository employeeRepository = new EmployeeRepository();
		Employee employee = new Employee(101, "Anjali", 80000);
		Employee employee2 = new Employee(102, "test2", 1000);
		Employee employee3 = new Employee(103, "test3", 2000);
		Employee employee4 = new Employee(105, "test4", 4000);
		employeeRepository.addEmployee(employee); // Emp class object is transferred to emprepo class
		employeeRepository.addEmployee(employee2);
		employeeRepository.addEmployee(employee3);
		employeeRepository.addEmployee(employee4);
		
		System.out.println("---------------------------------");
		List<Employee> ep = employeeRepository.getAll();
		for (Employee a : ep) {
			System.out.println(a);
		}
		System.out.println();
		Employee p = employeeRepository.getEmployeeByEmployeeId(103);
		System.out.println(p);
		System.out.println("------------------------------------");
		System.out.println("all objects before delete------------------------");
		
		
		List<Employee> elist = employeeRepository.getAll();
		for (Employee e : elist) {
			System.out.println(e);
		}

		boolean result = employeeRepository.DeleteEmpById(101);
		System.out.println("after delete------------------------");
		elist = employeeRepository.getAll();
		for (Employee e : elist) {
			System.out.println(e);
		}
		
		System.out.println("update");
		
		System.out.println();
		
		Employee up = new Employee(111, "Anjali", 90000000);
		employeeRepository.UpdateEmpDetail(up);
		ep = employeeRepository.getAll();
		for (Employee pl : elist) {
			System.out.println(pl);
		}
	}
	
}
