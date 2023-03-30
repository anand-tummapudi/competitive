package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> employeeList = new ArrayList<>();
		
		employeeList.add(new Employee("Tummapudi","Anand", 23.45, 38));
		employeeList.add(new Employee("Tummapudi","Manju", 23.45, 38));
		employeeList.add(new Employee("Tummapudi","Jayanthi", 23.45, 38));
		employeeList.add(new Employee("Tummapudi","Nihith", 23.45, 38));
		employeeList.add(new Employee("Tummapudi","Nihira", 23.45, 38));
		employeeList.add(new Employee("Tummapudi","Sujatha", 23.45, 38));
		employeeList.add(new Employee("Tummapudi","Suneetha", 23.45, 38));
		
		List<String> names = employeeList.stream().map(e->e.getLastName()).sorted().collect(Collectors.toList());
		
		List<ArrayList<Employee>> empList = new ArrayList<ArrayList<Employee>>();
		empList.add(employeeList);
		empList.add(employeeList);
		empList.add(employeeList);
		empList.add(employeeList);
		
		System.out.println(names);
		
		System.out.println(empList);
		
		List<Stream<String>> names2 = empList.stream().map(emp->emp.stream().map(e->e.getLastName())).collect(Collectors.toList());
		names.forEach(n->System.out.println(n));
		
	}

}
