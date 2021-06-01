package com.capg;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Override
	public String toString() {
		return "Employee [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	

}
