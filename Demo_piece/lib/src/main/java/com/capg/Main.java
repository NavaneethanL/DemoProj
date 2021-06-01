package com.capg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.capg")
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context =	new	AnnotationConfigApplicationContext(Main.class);
		
		Employee emp =	context.getBean(Employee.class);
		
		System.out.println(emp);


	}

}
