package edu.kh.suchan;

import java.util.Scanner;

public class homework {
	
	public void ph() {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 모든 사람이 사탕을 골고루 나눠가지려고 한다. 
		 * 인원 수와 사탕 개수를 키보드로 입력 받고
		   1인당 동일하게 나눠가진 사탕 개수와 나눠주고 
		   남은 사탕의 개수를 출력하세요.
	
		 * [실행화면]
			인원 수 : 29
			사탕 개수 : 100
			1인당 사탕 개수 : 3
			남는 사탕 개수 : 13

		 * */
		System.out.print("인원 수 :");
		int a = sc.nextInt();
		
		System.out.print("사탕 개수 :");
		int b = sc.nextInt();
		
		System.out.printf("1인당 사탕개수 : %d / %a", b,a);
	}
}
