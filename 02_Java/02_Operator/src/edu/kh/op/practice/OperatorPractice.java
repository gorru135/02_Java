package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {

	public void practice1(){
		
		public void practice1(){
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("인원 수 : ");
			int str1 = sc.nextInt();
			
			System.out.print("사탕 개수 : ");
			int str2 = sc.nextInt();
			
			System.out.printf("1인당 사탕 개수 : %d\n" , str2 / str1);
			System.out.printf("1인당 사탕 개수 : %d\n" , str2 % str1);
			

		}
		
		public void practice2(){
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("학년 : ");
			int grade = sc.nextInt();
			
			System.out.print("반 : ");
			int classroom = sc.nextInt();
			
			System.out.print("번호 : ");
			int number = sc.nextInt();
			
			System.out.print("성별(남학생/여학생) : ");
			String gender = sc.next();
			
			System.out.print("성적 : ");
			double score = sc.nextDouble();
			
			System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.\n", grade,classroom,
					number,name,gender,score);
			
			
		}
		
		/*
		 * 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
	세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.

	*[실행화면]
	국어 : 60
	영어 : 80
	수학 : 40
	합계 : 180
	평균 : 60.0
	*
	*
	*/
		
		public void practice3() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("국어 : ");
			int kor = sc.nextInt();
			
			System.out.print("영어 : ");
			int eng = sc.nextInt();
			
			System.out.print("수학 : ");
			int math = sc.nextInt();
			
			int sum = kor + eng + math; //합계 
			double avg = sum / 3.0; // 평균 
			
			System.out.println("합계 : " + sum);
			
			System.out.printf("평균 : %.1f\n" , avg);
			
			boolean result = (kor >= 40) && (eng >=40) && (math >= 40);
			
			System.out.println( result ? "합격" : "불합격");
		}
			
}


