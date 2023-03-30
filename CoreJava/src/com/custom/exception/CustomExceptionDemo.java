package com.custom.exception;

public class CustomExceptionDemo {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int age = -50;
		validateAge(age);

	}
	
	public static void validateAge(int age){
		
		if(age<0) {
			throw new AgeLessThanZeroException("Oh No ..age can't be negative");
		}
		
	}

}
