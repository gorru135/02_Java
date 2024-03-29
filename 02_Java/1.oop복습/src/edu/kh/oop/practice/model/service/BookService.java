package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Book;

public class BookService {
	
	
	public void practice() {
		
		Book b1 = new Book();
		Book b2 = new Book();
		
		b1= new Book();
		b2= new Book( "자바의정석",30000,0.2,"남궁성");
		
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println("===========================");
		System.out.println("수정된 결과 확인");
		
		b1.setTitle("C언어");
		b1.setPrice(30000);
		b1.setDiscountRate(0.1);
		b1.setAuthor("홍길동");
		System.out.println(b1.toString());
		
		System.out.println("===========================");
		
		System.out.printf("도서명 : %s\n",b1.getTitle());
		System.out.printf("할인된 가격 = %d원\n", 
				(int)(b1.getPrice() - (b1.getPrice() * b1.getDiscountRate())));
		
		System.out.printf("도서명 : %s\n",b2.getTitle());
		System.out.printf("할인된 가격 = %d원\n", 
				(int)(b2.getPrice() - (b2.getPrice() * b2.getDiscountRate())));
	}
}
