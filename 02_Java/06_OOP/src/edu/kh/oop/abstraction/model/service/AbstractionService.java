package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

// service : 특정 기능(비즈니스 로직)을 제공하는 클래스 

public class AbstractionService {
	
	// ctrl + shift + o : 해당 클래스에서 임포트 안된거 전부 임포트하기 
	public void ex1() {
		// 국민 객체 만들기 
		
		People p1 = new People();
		// People p1 : People 객체의 주소를 저장하여 참조하는 변수 p1
		// new People(); : 새로운 People 객체를 Heap 영역에 생성
		
		// ** 클래스 이름이 자료형처럼 사용된다
		// == 그래서 클래스를 "사용자 정의 자료형"이라고도 한다!! **
		
		/*
		p1.name = "홍길동";
		p1.gender = '남';
		p1.pNo = "910207 - 1000000";
		p1.address = "서울시 중구 남대문로 120 그레이층청계 3층 E강의장";
		p1.phone = "010-9999-9999";
		p1.age = 34;
		
		System.out.println("p1의 name : " + p1.name);
		System.out.println("p1의 gender : " + p1.gender);
		System.out.println("p1의 pNo : " + p1.pNo);
		System.out.println("p1의 address : " + p1.address);
		System.out.println("p1의 phone : " + p1.phone);
		System.out.println("p1의 age : " + p1.age);
		*/
		
		p1.setName("홍길동");
		p1.setGender('남');
		p1.setpNo("910207-1000000");
		p1.setAddress("서울시 중구 남대문로 120 그레이층청계 3층 E강의장");
		p1.setPhone("010-9999-1111");
		p1.setAge(34);
		
		System.out.println("p1의 name : " + p1.getName());
		System.out.println("p1의 gender : " + p1.getGender() );
		System.out.println("p1의 pNo : " + p1.getpNo() );
		System.out.println("p1의 address : " + p1.getAddress( ));
		System.out.println("p1의 phone : " + p1.getPhone());
		System.out.println("p1의 age : " + p1.getAge());
		
		p1.tax();
		p1.vote();
		
		// 본인 객체 
		
		People p2 = new People();
		System.out.println("=================================");
		
		p2.setName("박수찬");
		p2.setGender('남');
		p2.setpNo("910207-1000000");
		p2.setAddress("서울시 중구 남대문로 120 그레이층청계 3층 D강의장");
		p2.setPhone("010-5555-1111");
		p2.setAge(34);
		
		System.out.println("p2의 name : " + p2.getName());
		System.out.println("p2의 gender : " + p2.getGender() );
		System.out.println("p2의 pNo : " + p2.getpNo() );
		System.out.println("p2의 address : " + p2.getAddress( ));
		System.out.println("p2의 phone : " + p2.getPhone());
		System.out.println("p2의 age : " + p2.getAge());
		
		p2.tax();
		p2.vote();
		
		
		
	}
	

}
