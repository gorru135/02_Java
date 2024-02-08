package com.kh.variable.practice2;

import java.util.Scanner;

public class pracrice2 {

	public void ex2() {
		// 키보드로 문자 하나를 입력 받아 그 문자의 유니코드를 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 :");
		
		double dou1 = sc.nextDouble();
		
		System.out.print("영어 :");
		
		double dou2 = sc.nextDouble();
		
		System.out.print("수학 :");
		
		double dou3 = sc.nextDouble();
		
		System.out.printf(" 총점 : %d\n",(int)(dou1+dou2+dou3) );
		System.out.printf(" 총점 : %d\n",(int)(dou1+dou2+dou3)/3 );
				
		
	}
}

