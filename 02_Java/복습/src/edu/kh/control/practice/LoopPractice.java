package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
 
	Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int number = sc.nextInt();
		
		if(number < 1) {
			System.out.print("1 이상의 숫자를 입력해주세요.");
			
		} else {
			
			for(int i = 1; i <=number; i++) {
				
				System.out.print(i+ " ");
			}
		}
	}

	public void practice2() {
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int number = sc.nextInt();
		
		if(number > 1) {
			
			for(int i = number; i >=1; i--) {
				
				System.out.print(i + " ");
			}
			
		} else {
			System.out.print("1 이상의 숫자를 입력해주세요.");
		}
	}

	public void practice3() {
		System.out.print("정수를 하나 입력하세요 : ");
		
		int number = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= number-1; i ++) {
			sum += i;
			System.out.print(i +" + ");
			
			
		}
		sum+=number;
		System.out.print(number + " = " + sum);
	}

	public void practice4() {
		/*
		실습문제 4
		사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.

		ex.
		첫 번째 숫자 : 8	첫 번째 숫자 : 4	첫 번째 숫자 : 9
		두 번째 숫자 : 4 	두 번째 숫자 : 8 	두 번째 숫자 : 0
		4 5 6 7 8 			4 5 6 7 8 			1 이상의 숫자를 입력해주세요.
		*/
		
		System.out.print("첫 번째 숫자 : ");
		int first = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int second = sc.nextInt();
		
		if((first < 1) && (second < 1)) {
			System.out.print("1 이상의 숫자를 입력해주세요");
			
		} else {
			int sum1 = first;
			int sum2 = second;
			
			if(sum1 > sum2) {
				
				first = sum2;
				second = sum1;

			}
			for(int i = first; i<=second; i++) {
				System.out.print(i + " ");
			}
		}
	}

	public void practice5() {
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		
		int number = sc.nextInt();
		
		for(int i = 1; i<=number; i++) {
			System.out.print(i + " ");
			
		}
	}

}


