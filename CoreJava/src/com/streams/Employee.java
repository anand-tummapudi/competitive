package com.streams;

import java.util.List;

public class Employee {
	
	private String firstName;
	private String lastName;
	private Double salary;
	private int age;
	private List<Employee> employeeList;
	
	
	
	public Employee() {
		super();
	}
	
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + ", age=" + age
				+ ", employeeList=" + employeeList + "]";
	}
	public Employee(String firstName, String lastName, Double salary, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.age = age;
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Employee> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	
	

}
