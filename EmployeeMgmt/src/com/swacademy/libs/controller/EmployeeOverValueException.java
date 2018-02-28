package com.swacademy.libs.controller;
//Unchecked Exception
public class EmployeeOverValueException extends RuntimeException {
	public EmployeeOverValueException(String msg){
		super(msg);
	}
}
