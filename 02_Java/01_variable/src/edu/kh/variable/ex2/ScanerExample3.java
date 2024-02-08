package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScanerExample3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 문자열(String) 입력 
		// 문자열을 3번 입력받아 한줄로 출력하기 
		
		// ex)
		// 입력 1 : 안녕?
		// 입력 2 : 반갑습니다. 
		// 입력 3 : 점심 뭐 먹을까요?
		
		System.out.print("입력 1 :");
		
		String str1 = sc.next(); 
			
		System.out.print("입력 2 :");
		
		String str2 = sc.next();
		
		System.out.print("입력 3 :");
		
		String str3 = sc.next(); 
		
		System.out.printf("%s %s %s\n",str1, str2, str3);
		
 	}
}
