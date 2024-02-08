package edu.kh.park;

import java.util.Scanner;

public class ParkAssist {
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
		/*
		 * 모든 사람이 사탕을 골고루 나눠가지려고 한다. 
		 * 인원 수와 사탕 개수를 키보드로 입력 받고
			1인당 동일하게 나눠가진 사탕 개수와 나눠주고 
			남은 사탕의 개수를 출력하세요.
		 * */
		
		System.out.print("인원 수 : ");
		int satang = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int input = sc.nextInt();
		
		System.out.printf("1인당 사탕 개수 : %d\n" ,input / satang);
		System.out.printf("남은 개수 : %d\n" ,input % satang);
		
	}

	public void ex2() {
		
		/*키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.

		ex.
		이름 : 홍길동
		학년(정수만) : 3
		반(정수만) : 4
		번호(정수만) : 15
		성별(남학생/여학생) : 남학생
		성적(소수점 아래 둘째 자리까지) : 85.75
		3학년 4반 15번 홍길동 남학생의 성적은 85.75이다.
		 * 
		 * */
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년 : ");
		int clas = sc.nextInt();
		
		System.out.print("반 : ");
		int classroom = sc.nextInt();
		
		System.out.print("번호 : ");
		int number = sc.nextInt();
		
		System.out.print("성별 : ");
		String gender = sc.next();
		
		System.out.print("성적 : ");
		double sum = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.",clas,classroom,number,name,gender,sum);
	}

	public void ex3() {
		
		/*국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
			세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
			
			[실행화면]
			국어 : 60
			영어 : 80
			수학 : 40
			합계 : 180
			평균 : 60.0
		 * 
		 * */
		
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int mat = sc.nextInt();
		
				
		int sum = kor + eng + mat;
		double num = sum / 3.0;
		
		System.out.println("합계 :" + sum);
		System.out.printf("평균 : %.1f\n" , num);
		
		boolean result = (kor >= 40) && (eng >= 40) && (mat >= 40) && (num >= 60);
		
		System.out.println(result ? "합격" : "불합격");
	}
}
