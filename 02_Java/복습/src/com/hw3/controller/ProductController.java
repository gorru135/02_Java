package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;

public class ProductController {
	
	private Product[] pro = null;
	public static int count = 0;
	
	Scanner sc = new Scanner(System.in);
	
	{
		pro = new Product[10];
	}
	
	public void mainMenu() {
		int menu = 0;
		
		do {
			System.out.println("===== 제품 관리 메뉴 =====");
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 전체 조회");
			System.out.println("3. 제품 정보 삭제");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: productInput(); break;
			case 2: productPrint(); break;
			case 3: productDelete(); break;
			case 9: System.out.println("프로그램을 종료합니다."); break;
			default: System.out.println("잘못입력하였습니다. 다시 입력해주세요."); break;
			}
			
		}while(menu != 9);
	}
	
	public void productInput() {
		
		System.out.print("제품 번호 : ");
		int pId = sc.nextInt();
		sc.nextLine();
		System.out.print("제품 이름 : ");
		String pName = sc.nextLine();
		System.out.print("제품 가격 : ");
		int price = sc.nextInt();
		System.out.print("제품 세금 : ");
		double tax = sc.nextDouble();
		
		pro[count] = new Product(pId, pName, price, tax);
		
	}
	
	public void productPrint() {
		for(int i=0; i<count; i++) {
			System.out.println(pro[i].information());
		}
	}
	
	 public void productDelete() {
	        System.out.print("삭제할 제품의 번호를 입력하세요: ");
	        int deleteId = sc.nextInt();
	        boolean found = false;

	        for (int i = 0; i < count; i++) {
	            if (pro[i].getPid() == deleteId) {
	                found = true;
	                System.out.println("다음 제품을 삭제하시겠습니까?");
	                System.out.println(pro[i].getpName());
	                System.out.print("삭제하려면 'y'를 입력하세요: ");
	                String confirm = sc.next();
	                
	                if (confirm.equalsIgnoreCase("y")) {
	                    for (int j = i; j < count - 1; j++) {
	                        pro[j] = pro[j + 1];
	                    }
	                    count--;
	                    System.out.println("제품이 삭제되었습니다.");
	                } else {
	                    System.out.println("삭제가 취소되었습니다.");
	                }
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("해당 제품이 존재하지 않습니다.");
	        }
	    }

}
