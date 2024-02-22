package com.hw2.run;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Prisoner;
import com.hw2.model.service.Company;
import com.hw2.model.service.ManagementSystem;
import com.hw2.model.service.Prison;

public class Run {

	public static void main(String[] args) {
		
		ManagementSystem company = new Company(10);
        ManagementSystem prison = new Prison(10);
        
        company.addPerson(new Employee("EMP001", "유재석", "기획팀")); // 다형성 업캐스팅 사용
        company.addPerson(new Employee("EMP002", "정형돈", "개발팀")); // 다형성 업캐스팅 사용
        
        // 등록된 직원 모두 조회
        company.displayAllPersons(); // 동적바인딩 적용
	}
}
