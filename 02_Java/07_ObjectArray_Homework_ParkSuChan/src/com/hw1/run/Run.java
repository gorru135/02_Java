package com.hw1.run;

import com.hw1.model.vo.Employee;


public class Run {
	
	
	
	public static void main(String[] args) {
		
		Employee[] emp = new Employee[3];
		//객체배열의 크기 3으로 할당 한 뒤 3개의 생성자를 각각 이용하여 객체 생성 후 출력
	
		emp[0] = new Employee();
		emp[1] = new Employee(1,"홍길동",19,'M',"01011112222","서울잠실");
		emp[2] = new Employee(2,"강말순","교육부","강사",
				20,'F',1000000,0.01,"01011112222","서울 마곡");
		//emp[0] = new Employee(0,"김말똥","영업부","팀장",30,'M',3000000,0.2,
			//	"01055559999","전라도 광주");
		
		
		for(int i =0; i< emp.length; i++) {
			System.out.println("emp["+i+"]" + emp[i].information());
		}
		
		System.out.println("===========================================================");
		
		//2. 3개의 객체 중 값이 없는 필드에 각각 값을 넣고 출력 
		emp[0].setEmpNo(0);
		emp[0].setEmpName("김말똥");
		emp[0].setDept("영업부");
		emp[0].setJob("팀장");
		emp[0].setAge(30);
		emp[0].setGender('M');
		emp[0].setSalary(3000000);
		emp[0].setBonusPoint(0.2);
		emp[0].setPhone("01055896324");
		emp[0].setAdress("전라도 광주");
		
		emp[1].setDept("기획부");
		emp[1].setJob("부장");
		emp[1].setSalary(4000000);
		emp[1].setBonusPoint(0.3);
		
		System.out.println("emp[0] : " + emp[0].information());
		System.out.println("emp[1] : " + emp[1].information());
		
		System.out.println("=============================================");
		int sum= 0;
		
		for(int i=0;i < emp.length; i++) {
			
			int sumSalary = (int) ( emp[i].getSalary() + (emp[i].getSalary() * emp[i].getBonusPoint())  ) *12;
			System.out.println(emp[i].getEmpName() + "의 연봉 : " + sumSalary + "원");
			
			sum+=sumSalary;
		}
		System.out.println("===============================================");
		
		System.out.println("직원들의 연봉의 평균 : " + sum / emp.length + "원");
	}
}
