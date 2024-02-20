package edu.kh.backjun.psc;

import java.util.Scanner;

public class IfElse {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 A : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수 B : ");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1+ ">" +num2);
		
		} else if(num1 < num2) {
			System.out.println(num1+ "<" +num2);
		
		}else {
			System.out.println(num1+ "=" + num2);
		}
	}
}
