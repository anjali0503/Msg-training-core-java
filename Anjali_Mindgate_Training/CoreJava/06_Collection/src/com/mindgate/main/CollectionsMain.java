package com.mindgate.main;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import com.mindgate.pojo.Employee;
public class CollectionsMain {
	public static void main(String[] args) {
		List<String>  nameList = new ArrayList<>();
		System.out.println(nameList.size());
	
		nameList.add("Anjali");
		nameList.add("Ashish");
		nameList.add("Sayali");
		nameList.add("gagan");
		nameList.add("Anjali");
		nameList.add("kavita");
		System.out.println(nameList);
		System.out.println(nameList.size());
		
		nameList.remove(2);
		System.out.println("After remove");
		System.out.println(nameList);
		System.out.println(nameList.size());
		
		System.out.println();
		List<Employee> employeeList = new ArrayList<>();
		
		Employee employee1 = new Employee(101,"Kavita", 1000);
		Employee employee2  =new Employee(102, "Anjali", 5000);
		Employee employee3 = new Employee(103, "Ashish", 2000);
		
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
		
		System.out.println();
		System.out.println(employeeList);
		
		
		System.out.println();
		Set<String> set = new HashSet<>();
		set.add("Yash");
		set.add("Yash");
		set.add("yash");
		set.add("Anjali");
		set.add(null);
		set.add(null);
		
		System.out.println(set);
		
		
		System.out.println();
		SortedSet<String> sortedSet = new TreeSet<>();
		sortedSet.add("Anjali");
		sortedSet.add("ASHISH");
//		sortedSet.add(null);
		sortedSet.add("shivam");
		sortedSet.add("shruti");
		sortedSet.add("lucky"); 
		sortedSet.add("krishna");
		
		System.out.println(sortedSet);
		
		System.out.println();
		
		HashMap<Integer, String> employeeMap = new HashMap<>();
		employeeMap.put(101, "vivek");
		employeeMap.put(103, "Anjali");
		employeeMap.put(102, "Anj");
		System.out.println(employeeMap);
		
		System.out.println();
		Integer i = 50;
		System.out.println(i.hashCode());
		System.out.println();
		SortedMap<Integer, String> employeeSortedMap = new TreeMap<>()	;
		employeeSortedMap.put(1, "Test1");	
		employeeSortedMap.put(10, "Test10");
		employeeSortedMap.put(20, "Test20");
		employeeSortedMap.put(3, "Test 3");
		employeeSortedMap.put(4, "Test4");
		System.out.println(employeeSortedMap);
		
	}
}
