package edu.kh.progrmmers;


import java.util.Scanner;

public class Progrmmers {
	
	public static void main(String[] args) {
		
		for(int i =1; i<=20; i++) {
			
			switch(i % 5) {
				
				case 0 : System.out.println(i+ "5의 배수 입니다."); break;
				default : System.out.println(i+ "5의 배수 입니다."); break;
			}
			
			
		}

	
	}
	
	/*
	  public static String solution(String my_string, int n) {
	        String answer = "";
	        
	       
	        for (int i = 0; i < my_string.length(); i++) {
	        
	        		
	        	 
	        }
	        return answer;
	    }*/
	
	
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