package com.java8.lambdas;

public class CalImpl{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Impl....");
		
		String args2[] = null; 
		Calculator.main(args2);


	Calculator cal = (a,b)-> a*b;
	//cal.switchOn();
	
	System.out.println(cal.multiply(10, 5));
	
	
	}

}
