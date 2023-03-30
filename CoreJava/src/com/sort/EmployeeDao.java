package com.sort;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	
	public static List<Employee> getEmployees(){
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee(1,"Abc",23.45,"abcd"));
		employees.add(new Employee(2,"sab",844.45,"abcd"));
		employees.add(new Employee(3,"djs",45.45,"abcd"));
		employees.add(new Employee(5,"asdi",566.45,"abcd"));
		employees.add(new Employee(4,"srwes",473.45,"abcd"));
		employees.add(new Employee(6,"sadf7",8474.45,"abcd"));
		employees.add(new Employee(90,"kauena",373.45,"abcd"));
		employees.add(new Employee(23,"uikaabc",343.45,"abcd"));
		employees.add(new Employee(22,"mndghsytj",373.45,"abcd"));
		employees.add(new Employee(13,"asdyujhs",9374.45,"abcd"));
		
		return employees;
	}

}
