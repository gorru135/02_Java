package edu.kh.park.op;

import java.util.Scanner;

import com.hw2.model.dto.Employee;

public class OpAssist {
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
		arr[] emp = null;
		
		int employeeCount = sc.nextInt();
		
		if(employeeCount == 0) {
			
			for(int i = employeeCount; i< emp.length; i++) {
				
				employeeCount++;
				System.out.println("직원이 추가되었습니다.");
			}
			
		} else {
			
			System.out.println("인원이 모두 충원 되었습니다");
		}
		
	       				  
	 }
	}

