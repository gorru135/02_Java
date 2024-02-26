package edu.kh.progrmmers;


import java.util.Scanner;

public class Progrmmers {
		
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        
        String a = sc.next();
        String sum = "";
        
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i); // 각 문자열에서 문자를 가져옴
            if (Character.isUpperCase(c)) {
                sum += Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                sum += Character.toUpperCase(c);
            } else {
                sum += c;
            }
        }
        
        System.out.println("변환된 문자열 : " + sum);
    }
	
	
	/*
    public static int[] solution(int start_num, int end_num) {
        
    	int[] answer = new int[end_num - start_num + 1];
       
	//    	1과 5사이 1씩 증가하는 정수의 개수는
	//    	끝나는 정수 - 시작하는 정수 + 1 = 만큼의 정수 개수
	        
        for(int i = start_num; i <= end_num; i++) {
                
        	answer[i-start_num] = i;
        }
        
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }*/
	

}