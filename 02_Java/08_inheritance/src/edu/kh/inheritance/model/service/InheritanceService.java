package edu.kh.inheritance.model.service;

import edu.kh.inheritance.model.dto.Employee;
import edu.kh.inheritance.model.dto.Person;
import edu.kh.inheritance.model.dto.Student;

//비즈니스 로직 처리하는 클래스 
public class InheritanceService {

	
	// 상속 환인 예제 
	public void ex1() {
		
		Person p = new Person();
		
		p.setName("홍길동");
		p.setAge(30);
		p.setNationality("대한민국");
	
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getNationality());
	
		System.out.println("==================");
		
		// person을 상속받은 Student가 Person 필드, 메소드를
		// 정말 사용할 수 있는가?
		
		// student 객체 생성
	
		Student std = new Student();
		
		// Student만의 고유한 필드
		std.setGrade(3);
		std.setClassRoom(5);
		
		// Person 클래스로부터 상속받은 필드, 메서드
		std.setName("고길동");
		std.setAge(25);
		std.setNationality("대한민국");
		
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		
		System.out.println("====================");
		
		Employee emp = new Employee();
		
		emp.setCompany("KH정보교육원");
		
		// Person 클래스로부터 상속받은 메서드 
		emp.setName("박수찬");
		emp.setAge(7);
		emp.setNationality("대한민국");
		
		System.out.println(emp.getCompany());
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getNationality());
		
		p.breath();
		p.move();
		System.out.println("===========");
		std.breath();
		std.move();
		System.out.println("==============");
		emp.breath();
		emp.move();
		
		// 상속의 특징 : 코드 추가 및 수정에 용이함
		//				 코드 길이 감소 및 중복 제거 효과
		
	}
	//super() 생성자 이용방법
	public void ex2() {
		
		//student 매개변수 5개짜리 생성자 
		
		Student std = new Student("김철수", 17, "한국", 1, 3);
	
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		
		
	}
	// 오버라이딩 확인 예제
	public void ex3() {
		
		Student std = new Student();
		Employee emp = new Employee();
		
		
		//ps.move(); // 오버라이딩 x
		std.move(); // 오버라이딩 x -> person의 메소드 수행 
		
		
		emp.move(); // 오버라이딩 o -> Employee의 메소드 수행 
	
		
	}
	// toString() 오버라이딩 확인 예제
	public void ex4() {
		
		Person ps = new Person("김철수",17,"한국");
		
		System.out.println(ps.toString());
		System.out.println( ps );
		//print 구문 수행 시 참조변수명을 작성하면 
		//자동으로 toStirng() 메소드를 호출해서 출력해준다
		
		System.out.println("==================");
		
		Student std = new Student("이백점",18,"미국",2,6);
		System.out.println(std.toString());
		
		Employee emp = new Employee("김노동", 30, "한국", "삼성전자");
		
		System.out.println( emp );
	}

}
