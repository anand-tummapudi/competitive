package com.custom.exception;

public class AgeLessThanZeroException extends RuntimeException{

	public AgeLessThanZeroException(String message) {
		super(message);
	}
	
	public AgeLessThanZeroException(Throwable throwable) {
		super(throwable);
	}
}
