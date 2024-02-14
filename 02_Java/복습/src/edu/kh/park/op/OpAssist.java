package edu.kh.park.op;

import java.util.Scanner;

public class OpAssist {
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
		String[] fruits = {"사과","딸기","바나나","멜론","수박"};

		System.out.print("검색할 과일명 입력 : ");

		String searchName = sc.next();

		boolean result = false;

		for(int i=0; i < fruits.length; i++) {
			if(fruits[i].equals(searchName)) {
				result = true;
				break;
			}
		}

		if(result) {
			System.out.println("존재함");
		} else {
			System.out.println("존재하지 않음");
		}
		       				  
	 }
	}

