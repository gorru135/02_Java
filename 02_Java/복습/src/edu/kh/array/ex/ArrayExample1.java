package edu.kh.array.ex;

import java.util.Scanner;

public class ArrayExample1 {
	Scanner sc = new Scanner(System.in);
	public void practice8() {
		
        while (true) { // 3 이상의 수가 입력 될 때 까지 무한 반복
            // -> 3 이상이 입력되면 break문으로 종료

            System.out.print("정수 : ");
            int input = sc.nextInt();

            if (input < 3 || input % 2 == 0) { // 3 미만 또는 짝수인 경우 -> 반복
                System.out.println("다시 입력하세요.");

            } else {
                // 입력 받은 정수 만큼의 크기를 가지는 배열 생성
                int[] arr = new int[input];

                int num = 0; // arr 배열에 대입될 값

                for (int i = 0; i < arr.length; i++) {
                    if (i <= arr.length / 2) { // 중간 이전 까지 -> 증가
                        arr[i] = ++num;

                    } else { // 중간 이후 -> 감소
                        arr[i] = --num;
                    }

                    // 출력 시 , 추가 (단, 마지막 제외)
                    if (i == arr.length - 1) { // 마지막 바퀴
                        System.out.print(arr[i]);

                    } else {
                        System.out.print(arr[i] + ", ");
                    }

                }
                break; // while 반복 멈춤
            }
        }
	}

	public void practice9(){
		
		int[] arr = new int[10];

        for(int i=0 ; i<arr.length ; i++){
            arr[i] = (int)(Math.random() * 10 + 1);
        }

        System.out.print("발생한 난수 : ");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
	}


	public void practice10(){
		
        int[] arr = new int[10];

        // 2. 각 인덱스에 1부터 10 사이의 난수를 발생시켜 초기화 후 출력
        for(int i=0; i<arr.length; i++) {
            arr[i] = (int)(Math.random() * 10 + 1);

            System.out.print(arr[i] + " ");
        }

        System.out.println(); // 개행

        // 3. 반복문을 통해 최대값 최소값 알아내기
        int max = 1;  // 최소값을 담아줄 변수
        int min = 10; // 최대값을 담아줄 변수

        for(int i=0; i<arr.length; i++) {

            if(arr[i] > max) { // 해당 인덱스의 값이 max 보다 큰 경우
                max = arr[i]; // 해당 값을 max 변수에 담아줌
            }

            if(arr[i] < min) { // 해당 인덱스의  값이 min 보다 작은 경우
                min = arr[i]; // 해당 값을 min 변수에 담아줌
            }
        }

        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
	}

	public void practice11() {
		
        // 1. 10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
        int[] arr = new int[10];

        // 2. 각 인덱스 값에 1부터 10 사이의 난수를 발생시키는데 이때 중복이 없도록
        for(int i=0; i<arr.length; i++) {

            arr[i] = (int)(Math.random() * 10 + 1);

            for(int j=0; j<i; j++) { // 중복 제거
                if(arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
	}

	 public void practice12(){
	        // 1. 크기가 6인 정수형 배열 선언 및 할당
	        int[] lotto = new int[6];

	        // 2. 배열에 중복값없이 1부터 45사이의 난수 초기화
	        for(int i=0; i<lotto.length; i++) {
	            lotto[i] = (int)(Math.random() * 45 + 1);

	            for(int j=0; j<i; j++) { // 중복 제거
	                if(lotto[i] == lotto[j]) {
	                    i--;
	                    break;
	                }
	            }
	        }
	        
	        // 3. 오름차순 정렬(선택정렬)
	        for(int i=0; i<lotto.length-1; i++) { // 비교 주체
	            for(int j=i+1; j<lotto.length; j++) { // 비교 대상
	                if(lotto[i] > lotto[j]) { // 비교 주체가 비교 대상보다 큰 경우 값을 바꿔줘야됨

	                    int temp = lotto[i];
	                    lotto[i] = lotto[j];
	                    lotto[j] = temp;
	                }
	            }
	        }

	        // 4. 출력
	        for(int i=0; i<lotto.length; i++) {
	            System.out.print(lotto[i] + " ");
	        }
	 }
	 
	 public void practice13(){
		 
		 int[] arr = new int[9];
		 
		 int sum = 0;
		 
		 for(int i = 0; i< arr.length; i++) {
			 arr[i] = i +1;
			 System.out.print(arr[i] + " ");
			 
			 
			 if ( i % 2 ==0) {
				 sum += arr[i];
			 }
		 }
		 
		 System.out.println("\n짝수 번째 인덱스 합 : " + sum);
		 
	 }

	 public void practice2(){
		 
		 int arr[] = new int[9];
		 
		 int sum=0;
		 
		 for(int i = 1; i < arr.length; i++) {
			 arr[i] = i+1;
			 System.out.print(arr[i] + " ");
			 
			 if(i % 2 ==1) {
				 sum += arr[i];
			 }
		 }
		 System.out.println("\n홀수 번째 인덱스 합 : " +sum);
	 }

	 public void practice3(){
		 
		 System.out.print("양의 정수 : ");
		 int number = sc.nextInt();
		 
		 int arr[] = new int[number];
		 
		 for(int i = 0; i < arr.length; i++) {
			 
			 arr[i]= i+1;
			 
			 System.out.print(arr[i] + " ");
		 }
	 }

	    public void practice4() {
	 

	        int[] arr = new int[5];

	        for (int i = 0; i < arr.length; i++) {
	            System.out.printf("입력 %d : ", i);
	            arr[i] = sc.nextInt();
	        }

	        System.out.print("검색할 값 : ");
	        int search = sc.nextInt();

	        boolean flag = true;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == search) {
	                System.out.println("인덱스 : " + i);
	                flag = false;
	                break;
	            }
	        }

	        if (flag) System.out.println("일치하는 값이 존재하지 않습니다.");
	        }

	    public void practice7(){
	        

	        System.out.print("주민등록번호(-포함) : ");
	        String input = sc.next();

	        char[] arr = new char[input.length()];

	        for (int i = 0; i < arr.length; i++) {

	            if (i <= 7) { // 7번 인덱스 이하(생년월일, - , 성별)
	                arr[i] = input.charAt(i);
	            } else { // 8번 인덱스 이상부터는 *
	                arr[i] = '*';
	            }
	            System.out.print(arr[i]);
	        }
	    }

}
