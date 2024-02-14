package edu.kh.array.ex;

import java.util.Scanner;

public class Array2Example {
	Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		
		String[][] arr = new String[3][3];
		
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = "(" + i + ", " + j + ")";
            }
        }

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
	}

    public void practice2(){
        int[][] arr = new int[4][4];

        int value = 1;

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = value++;
            }
        }

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }
    }

public void RSPGame() {
		
		// 가위바위보 게임을 할건데,
		// 몇 판할지 입력받음
		// 입력받은 판 수 만큼 반복
		// 컴퓨터 : Math.random() : 0.0 ~ 1.0 미만 난수생성
		//int random = (int)(Math.random() * 3 + 1);
		// 0.0 <= x < 1.0
		// 0.0 <= x * 3 < 3.0
		// 1.0 <= x * 3 + 1 < 4.0
		// 1 <= (int)(x * 3 + 1) < 4
		// ==> 1이상 4 미만 정수 -> 1 2 3
		
		// 1) 1~3 사이 난수 생성
		// 2) 1이면 가위, 2이면 바위, 3이면 보 지정 (switch)
		// 컴퓨터와 플레이어 가위바위보 판별
		// 플레이어 승! / 졌습니다 ㅠㅠ 
		// 매판마다 - 현재 기록 : 2승 1무 0패 
		
		System.out.println("[가위 바위 보 게임~!!]");
		System.out.print("몇 판 ? : ");
		int round = sc.nextInt();
		
		// 승패 기록용 변수
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		for(int i = 1; i <= round; i++) { // 입력 받은 판 수 만큼 반복
			
			System.out.println("\n" + i + "번째 게임");
			System.out.print("가위/바위/보 중 하나를 입력 : ");
			String input = sc.next();
			
			int random = (int)(Math.random() * 3 + 1); // 1 2 3
			
			String com = null;
			// null : 아무것도 참조하고 있지 않음.
			
			switch(random) {
			case 1 : com = "가위"; break;
			case 2 : com = "바위"; break;
			case 3 : com = "보"; break;
			}
			
			// 컴퓨터는 [바위]를 선택했습니다
			System.out.printf("컴퓨터는 [%s]를 선택했습니다.\n", com);
			
			// 컴퓨터와 플레이어 가위바위보 판별
			if( input.equals(com) ) {
				System.out.println("비겼습니다");
				draw++;
				
			} else {
				
				boolean win1 = input.equals("가위") && com.equals("보");
				boolean win2 = input.equals("바위") && com.equals("가위");
				boolean win3 = input.equals("보") && com.equals("바위");
				
				if(win1 || win2 || win3) {
					System.out.println("플레이어 승!");
					win++;
					
				}else {
					System.out.println("졌습니다 ㅠㅠ");
					lose++;
					
				}
				
			}
			
			System.out.printf("현재 기록 : %d승 %d무 %d패\n", win, draw, lose);
			
			
		}
		
	}
	
	public void ex12() {
		
		while(true) {
			System.out.print("2~9사이 정수 입력 : " );
		
			int input = sc. nextInt() ;
			
			if(input >=2 || input <=9) {
				System.out.println("에러");
			}
		}
	}


}


