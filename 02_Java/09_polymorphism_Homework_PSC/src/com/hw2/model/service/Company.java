package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem{
	
	
	private int employeeCount;
	
	private Employee[] emp = null;
	
	
	
	public Company(int size) {
		
		employeeCount=0;
		
		emp = new Employee[size];
	
		
	}

	public void addPerson(Person person) {
		
			if(employeeCount == 0) {
				
				for(int i = employeeCount; i< emp.length; i++) {
					
					employeeCount++;
					System.out.println("직원이 추가되었습니다.");
					break;
				}
				
			} else {
				
				System.out.println("인원이 모두 충원 되었습니다");
			}
			
		
		
	}
	
	@Override
	public void removePerson(String id) {

		String str = null;
		
		
	}
	

	@Override
	public void displayAllPersons() {
		// TODO Auto-generated method stub
		
	}


	
}
