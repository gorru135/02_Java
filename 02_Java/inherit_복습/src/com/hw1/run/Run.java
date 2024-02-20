package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {
	

	public static void main(String[] args) {
		
		Student[] students = new Student[3];
		
		students[0] = new Student("홍길동",20,178.2,70.0,1,"정보시스템공학과");
		students[1] = new Student("김말똥",21,187.2,80.0,2,"정보시스템공학과");
		students[2] = new Student("강개순",23,167.0,45.0,4,"정보통신공학과");
		
		
		for(Student std :students) {
			
			System.out.println(std.information());
			
			
		}
		System.out.println("=================================");
		
		Employee[] employee = new Employee[10];
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		while(true) {
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			System.out.print("신장 : ");
			double height = sc.nextDouble();
			
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.print("부서 : ");
			String dept = sc.next();
			
			employee[count] = new Employee(name,age,height,weight,salary,dept);
			count++;
			
			System.out.println("계속 추가하시겠습니까? (y / n)");
			String str = sc.next().toUpperCase();
			
			if(str.equals("N")) break;
		}
		
		for(Employee emp : employee) {
			
			if(emp == null) break;//NullPointerException
			
			System.out.println( emp.information() );
		}
	}
	
}
