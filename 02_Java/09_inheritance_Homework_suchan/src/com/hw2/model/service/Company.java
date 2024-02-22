package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;


public class Company implements ManagementSystem{

	private Employee[] employees;
	private int employeeCount;
	
	
	public Company(int size) {
		this.employees = new Employee[size];
		this.employeeCount = 0;
		
	}
	
	/**
	 * 	추상메서드를 상속받아 오버라이딩
		해야하는 메서드. 매개변수로 전달받은
		Person 객체가 Employee 클래스의
		인스턴스이며, 배열에 공간이 있다면, 해당
		객체를 employees 배열에 추가 후 추가된
		객체의 정보를 출력.
		만약 배열에 더 이상 공간이 없다면, 인원이
		모두 충원되었다는 메시지 출력
	 */
	@Override
	public void addPerson(Person person) {
	
		if(person instanceof Employee &&
				employeeCount < employees.length) {
				employees[employeeCount++] = (Employee) person;
				System.out.println("직원이 추가되었습니다 - " + person.getinfo());
				
		} else {
			System.out.println("인원이 모두 충원되었습니다");
		}
	}
	
	@Override
	  public void removePerson(String id) {
	       for (int i = 0; i < employeeCount; i++) {
	           if (employees[i].getId().equals(id)) {
	               System.out.println("직원이 삭제되었습니다 - " + employees[i].getinfo());
	               employees[i] = null;
	               for (int j = i; j < employeeCount - 1; j++) { 
	            	   // 삭제한 요소가 있는 i번째 인덱스부터 배열의 마지막 요소까지 순차 접근
	            	   
	                   employees[j] = employees[j + 1];
	                   // 배열 내의 모든 후속 요소를 왼쪽으로 한 칸씩 이동하여 생성된 간격을 제거
	               }
	               employees[--employeeCount] = null;
	               // 배열의 마지막 요소를 null로 설정하고 employeeCount 변수를 감소시켜 직원 수를 줄입니다.
	               return;
	           }
	       }
	       System.out.println("ID : " + id + "인 직원을 찾을 수 없습니다.");
	   }
	
	
	   @Override
	   public void displayAllPersons() {
	       System.out.println("전체 직원 명단 : ");
	       for (int i = 0; i < employeeCount; i++) {
	           System.out.println(employees[i].getinfo());
	       }
	   }
	
	
	
}
