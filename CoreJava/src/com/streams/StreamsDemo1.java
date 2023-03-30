package com.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamsDemo1 {
	
	public static void main(String args[]) {
		
		List<Employee> employeeList = new ArrayList();
		
		employeeList.add(new Employee("Anand","Raju",5000.0,38));
		employeeList.add(new Employee("Manju","Gaddam",5500.0,28));
		employeeList.add(new Employee("Ravi","Raja",6000.0,36));
		employeeList.add(new Employee("Suresh","kalani",6500.0,27));
		employeeList.add(new Employee("Manoj","Gupta",7000.0,46));
		employeeList.add(new Employee("Rahul","Jain",7200.0,24));
		
		employeeList.stream().forEach(employee -> System.out.println(employee));
		
		//employeeList.stream().map(employee->employee.getSalary()+20).collect(null);
		
		
	}

}
