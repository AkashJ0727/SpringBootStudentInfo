package com.student.info.exception;

public class ResourceNotFoundException extends RuntimeException{
	
	
	ResourceNotFoundException(String string){
		super("student with given id not found");
	}

}
