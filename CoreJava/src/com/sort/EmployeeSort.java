package com.sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> empList = EmployeeDao.getEmployees();
		
		System.out.println(empList);
		
		//Collections.sort(empList,new EmployeeComparator());
		empList.sort(Comparator.comparing(Employee::getEmpId));
		
		System.out.println(empList);

	}
	
	

}
