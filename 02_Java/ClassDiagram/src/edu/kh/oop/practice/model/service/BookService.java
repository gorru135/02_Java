package edu.kh.oop.practice.model.service;



import edu.kh.oop.practice.model.vo.Book;

public class BookService {

	public void practice() {
		
		Book b1 = new Book();
		
		
		
		Book b2 = new Book("C언어",30000,0.1,"홍길동");
		
		
		System.out.println(b1);
				
		System.out.println("=====================================");
		System.out.println("수정된 결과 확인\n");
		
		
		System.out.println( b2.toString());
		System.out.println("=====================================");
		
		System.out.printf("도서명 = %s\n"
				  + "할인된 가격 = %d원\n", b2.getTitle(),b2.getPrice()-(int)(b2.getPrice() * b2.getDiscountRate()));
		
		System.out.println();
		System.out.printf("도서명 = %s\n"
						  + "할인된 가격 = %d원", b1.getTitle(),b1.getPrice()-(int)(b1.getPrice() * b1.getDiscountRate()));
				
	}
	
	
}
