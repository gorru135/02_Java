package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample { // 기능 제공용 클래스 

	
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
		// if문 
		// 조건식이 true 일때만 내부 코드 수행 
		
		/* [작성법]
		 * 
		 * if(조건식){
		 * 
		 * 		조건식이 true 일 때 수행할 코드 
		 *
		 * }
		 * 
		 * */
		
		// 입력받은 정수가 양수인지 검사 
		// 양수라면 "양수입니다" 출ㄴ력 
		
		
		System.out.print("정수 입력 :");
		int num = sc.nextInt();
		
		
		if(num > 0) {
			
			System.out.println("양수입니다.");
		}
		
		if(num <= 0) {
			System.out.println("양수가 아니다.");
		}
	}
	
	public void ex2() {
		
		// if - else 문
		// 조건식 결과가 true면 if문,
		// flase면 else 구문이 수행됨 
		
		/*
		 * [작성법]
		 * if(조건식){
		 * 		조건식이 true일 때 수행될 코드 
		 * } else {
		 * 		조건식이 flase일 때 수행될 코드 
		 * }
		 * 
		 * 
		 * */
		//홀짝 검사
		// 입력 받은 정수값이 홀수이면 "홀수입니다"출력
		// 0이면 "0입니다"
		// 짝수이면 "짝수입니다" 출력
		
		System.out.print("정수 입력 :");
		int num = sc.nextInt();
		
		if(num % 2 != 0) {
			
			System.out.println("홀수입니다.");
			
		}else {
			
			if(num == 0) {
				System.out.println("0입니다.");
			} else {
				System.out.println("짝수입니다.");
			}
		}
	}
	
	public void ex3() {
		// 양수,음수, 0판별
		// if(조건식) - else if(조건식) - else 
		
		System.out.print("정수입력 : ");
		int input = sc.nextInt();
		
		if(input > 0) {
			System.out.println("양수 입니다.");
			
		}else if(input < 0) {
			System.out.println("음수 입니다.");
			
		}else {
			System.out.println("0입니다.");
		}
		
	}
	
	public void ex4() {
		
	}
	
	public void ex5() {
		// 나이를 입력 받아
		// 13세 이하면 "어린이 입니다."
		// 13세 초과 19세 이하면 : "청소년 입니다."
		// 19세 초과 시 : "성인 입니다". 출력
		
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		if(age <= 13) {
			System.out.print("어린이 입니다.");
			
		}else if(age > 13 && age <= 19) {
			System.out.print("청소년 입니다.");
			
		}else {
			System.out.print("성인 입니다.");
		}
	}
		
	public void ex6() {
		
		// 점수(100점 만점)를 입력 받아
		// 90점 이상 : A
		// 80점 이상 90점 미만 : B
		// 70점 이상 80점 미만 : C
		// 60점 이상 70점 미만 : D
		// 60점 미만 : F
		// 0점 미만, 100 초과 : "잘못 입력하셨습니다"
		
		System.out.print("점수 입력 : ");
		int sum = sc.nextInt();
		
		if (sum < 0 || sum > 100) {
			
			System.out.print("잘못 입력하셨습니다.");
			
		} else {
			
			if(sum >= 90) {
				System.out.print("A");
				
			} else if (sum >= 80 && sum < 90) {
				System.out.println("B");
			
			} else if(sum >= 70 && sum < 80) {
				System.out.println("C");
				
			} else if(sum >= 60 && sum < 70) {
				System.out.println("D");
				
			} else {
				System.out.println("F");
				}
			
		}
			
		
		
		
	}
	
	
	public void ex7() {
		
		// 놀이기구 탑승 제한 검사
		// 나이가 12세 이상, 키 140.0cm 이상 일 경우에만 "탑승 가능"
		// 나이가 12미만인 경우 : "적정 연령이 아닙니다."
		// 키가 140.0cm 미만 : "적정 키가 아닙니다."
		// 나이를 0세 미만, 100세 초과 시 : "잘못 입력 하셨습니다."
		
		System.out.print("놀이기구 탑승제한 나이검사 : ");
		int age = sc.nextInt();
		
		if (age < 0 || age >= 100) {
			
			System.out.print("잘못 입력 하셨습니다.");
			
		} else {
			
			if (age < 12) {
				System.out.print("적정 연령이 아닙니다");
				
			} else {
				
				System.out.print("키 입력 : ");
				Double key = sc.nextDouble();
				
				if ( key >= 140){
					System.out.print("탑승 가능");
					
				} else {
					System.out.print("적정 키가 아닙니다.");
				}
			}
		}
		
		
	}

	public void ex8() {
		
		// 놀이기구 탑승 제한 검사 프로그램
		// 조건 - 나이 : 12세 이상
		// - 키 : 140.0cm 이상
		// 나이를 0~100세 사이로 입력하지 않은 경우 : "나이를 잘못 입력 하셨습니다."
		// 키를 0~250.0cm 사이로 입력하지 않은 경우 : "키를 잘못 입력 하셨습니다."
		// -> 입력이 되자 마자 검사를 진행하여 잘못된 경우 프로그램 종료
		// 나이 O , 키 X : "나이는 적절하나, 키가 적절치 않음";
		// 나이 X , 키 O : "키는 적절하나, 나이는 적절치 않음";
		// 나이 X , 키 X : "나이와 키 모두 적절치 않음";
		// 나이 O , 키 O : "탑승 가능"
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		String ex;
		
		if( age < 0 || age>100) {
			
			ex = "나이를 잘못 입력했어요";
			
		} else {
			
			System.out.println("키 입력 : ");
			
			double height = sc.nextDouble();
			
			if(height <0 || height > 250) {
				
				ex = "키를 잘못 입력 했어요";
				
			} else {
				
				if( age < 12 && height >= 140.0) {
					ex = "키는 적절하나, 나이가 적절치 않음.";
					
				} else if(age >=12 && height < 140.0) {
					ex = "나이는 적절하나, 키가 절절치 않음.";
					
				} else if(age < 12 && height <140.0) {
					ex = "나이와 키 모두 적절치 않음.";
					
				} else {
					ex = "탑승 가능!";
				}
				
			}
		}
	}
}

		

	

	
		
		