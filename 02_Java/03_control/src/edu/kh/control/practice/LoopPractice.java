package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		
		/*
		 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
			단, 입력한 수는 1보다 크거나 같아야 합니다.
			만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
			
			ex.
			1이상의 숫자를 입력하세요 : 4 1이상의 숫자를 입력하세요 : 0
			1 2 3 4 1 이상의 숫자를 입력해주세요.
		 * */
		
		System.out.print("숫자 : ");
		int number = sc.nextInt();
		if (number < 1 ) {
			
			System.out.println("1 이상의 숫자를 입력해주세요");
			
		} else {
			
			for (int i = 1; i <= number; i++) {
				System.out.print(i + " ");
			}
		}
		
	}

	public void practice2(){
		/*
		 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
			단, 입력한 수는 1보다 크거나 같아야 합니다.
		 * */
		System.out.print("숫자 : ");
		int number = sc.nextInt();
		if (number >= 1 ) {
			
			System.out.println("1 이상의 숫자를 입력해주세요");
			
		} else {
			
			for (int i = 1; i >= number; i--) {
				System.out.print(i + " ");
			}
		}
		
		
	}

	public void practice3(){
		
		/*
		 * 1부터 사용자에게 입력 받은 수까지의 정수들의 
		 * 합을 for문을 이용하여 출력하세요.
		 * 
		 * 정수를 하나 입력하세요 : 8
		   1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
		 * */
		System.out.print("정수 하나를 입력하세요 : ");
		int input = sc.nextInt();
		
		int sum = 0;
		
		for(int i= 1; i <= input-1; i++) {
			
			sum += i;
			System.out.print(i + " + ");
		}
		sum += input;
		System.out.print(input + " = " + sum);
		
	}	

	public void practice4(){
		
		/*
		 * 
		 * 사용자로부터 두 개의 값을 입력 받아 
		 * 그 사이의 숫자를 모두 출력하세요.
			만일 1 미만의 숫자가 입력됐다면 
			“1 이상의 숫자를 입력해주세요“를 출력하세요.
			*/
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 < 1) { // 1 미만의 숫자가 입력된 경우
			System.out.println("1 이상의 숫자를 입력해주세요.");
			
		} else {
			
			// 출력을 위한 for문의 초기식, 조거식 값 구하기
			
			// 일단 start에 첫 번째 숫자,  end에 두 번째 숫자를 대입하고
			int start = num1;
			int end = num2;
			
			// 만약 첫 번째 숫자가 크다면 start, end의 값 바꾸기
			if(num1 > num2) {
				start = num2;
				end = num1;
			}
			
			for(int i=start ; i<=end ; i++) {
				System.out.print(i + " ");
			}
		}
		
	}



}
	