package edu.kh.progrmmers;

import java.util.Scanner;

public class Progrmmers {
	
	public static void main(String[] args) {
	
		System.out.println(solution(34, 3));
	
	
	}
	

	
    public static int solution(int num, int n) {
        int answer = 0;
        
        if(num % n ==0){
            answer += 1; 
            
        } else {
        	answer +=0;
        }
        return answer;
    }

}