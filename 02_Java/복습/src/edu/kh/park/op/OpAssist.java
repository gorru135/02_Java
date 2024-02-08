package edu.kh.park.op;

import java.util.Scanner;

public class OpAssist {
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
		// 나이를 입력 받아
		// 13세 이하면 "어린이 입니다."
		// 13세 초과 19세 이하면 : "청소년 입니다."
		// 19세 초과 시 : "성인 입니다". 출력
		
		System.out.print("나이 입력 :");
		
		int age = sc.nextInt();
		
		if(age <= 13) {
			System.out.println("어린이 입니다.");
		} else if((age > 13) && (age <= 19)) {
			//13세 초과 19세 이하가 진짜일 경우 청소년 출력 
			System.out.println("청소년 입니다.");
		} else {
			System.out.println("성인입니다.");
		}
	}

	public void ex2() {
		// 점수(100점 만점)를 입력 받아
		// 90점 이상 : A
		// 80점 이상 90점 미만 : B
		// 70점 이상 80점 미만 : C
		// 60점 이상 70점 미만 : D
		// 60점 미만 : F
		// 0점 미만, 100 초과 : "잘못 입력하셨습니다"
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		if( (score < 0) || (score > 100)) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			
			if( score >= 90) {
				System.out.println("A");
			} else if ( (score >=80) && (score < 90)) {
				System.out.println("B");
			} else if ( (score >=70) && (score < 80)) {
				System.out.println("C");
				
			} else if ( (score >=60) && (score < 70)) {
				System.out.println("D");
				
			} else {
				System.out.println("F");
			}
		}
	}

	public void ex3() {
		// 놀이기구 탑승 제한 검사
		// 나이가 12세 이상, 키 140.0cm 이상 일 경우에만 "탑승 가능"
		// 나이가 12미만인 경우 : "적정 연령이 아닙니다."
		// 키가 140.0cm 미만 : "적정 키가 아닙니다."
		// 나이를 0세 미만, 100세 초과 시 : "잘못 입력 하셨습니다."

		
		System.out.print("놀이기구 탑승 제한 검사 : ");
		
		int age = sc.nextInt();
		
//		double cm = sc.nextDouble();
		
		if(age < 12) {
			System.out.println("적정 연령이 아닙니다.");
			
		} else {
			System.out.print("키 입력 : ");
			double cm = sc.nextDouble();
			
			if(cm >= 140.0) {
				System.out.println("탑승가능");
			} else {
				System.out.println("적정 키가 아닙니다.");
			}
		}
		
	}

	public void ex4() {
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
		
		System.out.print("나이 : ");
		
		int age = sc.nextInt();
		if ( (age < 0) || (age > 100)) {
			System.out.println("나이를 잘못 입력 하셨습니다.");
			
		} else {
			System.out.print("키 입력 : ");
			double cm = sc.nextDouble();
			
			if( (cm <0 ) || (cm > 250.0)) {
				System.out.println("키를 잘못 입력 하셨습니다.");
				
			} else if((age == 12) && (cm >= 140.0)) {
				System.out.println("탑승 가능 ");
				
			} else if( (age < 12) && (cm == 140.0)) {
				System.out.println("나이는 적절하나, 키가 적절치 않음");
				
			} else if( (age == 12) && (cm < 140.0)) {
				System.out.println("키는 적절하나, 나이는 적절치 않음");
				
			} else {
				System.out.println("나이와 키 모두 적절치 않음");
			}
			
		}
		
		
	}
}
