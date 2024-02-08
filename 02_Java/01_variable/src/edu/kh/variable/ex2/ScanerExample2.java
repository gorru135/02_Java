package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScanerExample2 {
	
	public static void main(String[] args) {
		
		// 사칙연산 계산기 
		// -> 두 실수를입력받아 사칙연산 결과를 모두 출력 
		// -> 단, 출력된 결과값은 소수점 이하 2째자리까지만 표현 
		
		// 정수 : sc.nextInt()
		// 실수 : sc.nextDouble()
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("실수 1입력 :");
		
		double dou1 = sc.nextDouble();
		
		System.out.print("실수 2입력 :");
		
		double dou2 = sc.nextDouble();
		
		// + , -, *, /
		System.out.printf("%.2f + %.2f = %.2f\n",dou1,dou2,dou1+dou2);
		System.out.printf("%.2f - %.2f = %.2f\n",dou1,dou2,dou1-dou2);
		System.out.printf("%.2f * %.2f = %.2f\n",dou1,dou2,dou1*dou2);
		System.out.printf("%.2f / %.2f = %.2f\n",dou1,dou2,dou1/dou2);
	}
}
