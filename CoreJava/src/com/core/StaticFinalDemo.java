package com.core;

class Employee{
	
	public static int staticVar=10;
	public final int finalVar;
	public static final int staticFinalVar = 30;
	
	Employee(int finalVal){
		this.finalVar = finalVal;
	}
	
	public static int getStaticVar() {
		return staticVar;
	}
	public static void setStaticVar(int staticVar) {
		Employee.staticVar = staticVar;
	}
	public int getFinalVar() {
		return finalVar;
	}
	public static int getStaticfinalvar() {
		return staticFinalVar;
	}
	@Override
	public String toString() {
		return "Employee [finalVar=" + finalVar + "]";
	}
	
	
}

public class StaticFinalDemo {
	
	public static void main (String args[]) {
		
		Employee e1 = new Employee(5000);
		
		System.out.println(e1);
		
		e1.setStaticVar(50);
		
		System.out.println(e1);
		
		Employee e2 = new Employee(6000);
		
		//e2.finalVar = 500;
		e2.staticVar = 30;
		//e2.staticFinalVar = 50;
		
		System.out.println(e2);
		
	}

}
