package com.hw2.run;

import com.hw2.model.dto.Employee;
import com.hw2.model.service.Company;
import com.hw2.model.service.ManagementSystem;

public class Run {

	public static void main(String[] args) {
		
		Company cp = new Company(10);
		
		cp.addPerson(new Employee("아이디","박수찬","어려워"));
		
	}
}
