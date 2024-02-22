package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee[] ep = new Employee[10];
		
		Student[] sd = new Student[3];
		
		sd[0] = new Student("홍길동",20,178.2,70.0,1,"정보시스템공학과");
		sd[1] = new Student("김말똥",21,187.3,80.0,2,"경영학과");
		sd[2] = new Student("강개순",23,167.0,45.0,4,"정보통신공학과");
	
		for(Student std : sd) {
			System.out.println(std.information());
		}
		
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
			
			System.out.print("부서 : ");
			String dept = sc.next();
			
			
			ep[count] = new Employee(name, age, height, weight, salary,dept);
			count++;
			
			System.out.println("사원을 추가(Y/N) :");
			String str = sc.next().toUpperCase();
			
		
			
			if(str.equals("N")) break;
		}
		
		
		for(Employee emp : ep) {
			
			if(emp == null) break;
			System.out.println(emp.information());
		}
	}
}
