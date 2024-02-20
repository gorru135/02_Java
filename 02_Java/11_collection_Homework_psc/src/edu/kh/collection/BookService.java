package edu.kh.collection;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.book.Book;


public class BookService {
	private Scanner sc = new Scanner(System.in);
	private List<Book> book = new ArrayList<Book>();
	
	
	public BookService() {
		book.add(new Book(1111,"세이노의 가르침","유시민",6480,"데이원"));
		book.add(new Book(2222,"문과남자의 과학공부","세이노",15750,"돌베게"));
		book.add(new Book(3333,"역행자","자청",17550,"웅진지식하우스"));
		book.add(new Book(4444,"꿀벌의 예언","베르나르 베르베르",15120,"열린책들"));
		book.add(new Book(5555,"도둑맞은 집중력","요한 하리",16920,"어크로스"));
	}
	public void displayMenu() {
		
		int menuNum = 0;// 메뉴 선택용 변수 
		
		do {
			System.out.println("\n=======도서 목록 프로그램=======\n");
			System.out.println("1. 도서 등록");
			System.out.println("2. 도서 조회");
			System.out.println("3. 도서 수정");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 즐겨찾기 추가");
			System.out.println("6. 즐겨찾기 삭제");
			System.out.println("7. 즐겨찾기 조회");
			System.out.println("8. 추천도서 뽑기");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 선택 : ");
			
			try {
				
				menuNum = sc.nextInt(); 
				System.out.println();
				
				switch(menuNum) {
				case 1 : System.out.println(addBook()); break;
				case 2 : selctAll(); break;
				case 3 : updata(); break;
				case 4 : System.out.println();  break;
				case 5 : ; break;
				case 6 : ; break;
				case 7 : ; break;
				case 8 : ; break;
				case 0 : System.out.println("프로그램 종료..");break;
				default : System.out.println("메뉴에 작성된 번호만 입력하세요!"); break;
				
				}
				
				
			} catch(InputMismatchException e) {
				
				System.out.println("\neroor : 입력형식이 유효하지 않습니다. 다시 시도해주세요.");
				sc.nextLine(); 
				
				menuNum = -1; 
			}
			
		} while(menuNum != 0);
	}
	
	public String addBook() {
		System.out.println("====== 도서 등록 ======");
		
		System.out.print("도서 번호 : ");
		int booknumber = sc.nextInt();
		sc.nextLine();
		
		System.out.print("도서 제목 : ");
		String title = sc.nextLine();
		
		
		System.out.print("도서 저자 : ");
		String author = sc.nextLine();
		
		
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("도서 출판사 : ");
		String publisher = sc.nextLine();
	
		if(book.add(new Book(booknumber,title,author,price,publisher))) {
			
			return "등록 완료";
			
		} else {
			
			return "등록 실패";
		}
	
	
	}

	public void selctAll() {
		
		System.out.println("====== 도서 조회 ======");
		
		if(book.isEmpty()) {
			
			System.out.println("도서가 없습니다.");
			return;
		}
		
		int index = 0;
		for( Book bk : book) {
			
			System.out.print( (index++) + "번 : " );
			System.out.println( bk );
		}
	}

	public void updata() {
		
		System.out.println("====== 도서 수정 ======");
		
		System.out.print("수정할 도서 번호를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(book.isEmpty()) {
			 System.out.println("현재 도서가 없습니다.");
			
		} else if(input < 0) {
			
			System.out.println("음수는 입력할수 없습니다");
			
		} else if(input >= ) {
			
			System.out.println("범위를 넘었습니다.");
			
		} else {
			
			int menuNum = 0;
			
			do {
				
				Book bk = book.set(input, new Book());
				
				System.out.println("1. 도서명 : ");
				System.out.println("2. 도서 저자 : ");
				System.out.println("3. 도서 가격 : ");
				System.out.println("4. 도서 출판사 : ");
				System.out.println("0. 수정 종료");
				
				System.out.println("메뉴 선택 : ");
				
				switch(menuNum) {
				case 1 : bk.getTitle(); break;
				case 2 : bk.getAuthor(); break;
				case 3 : bk.getPrice(); break;
				case 4 : bk.getPublisher();break;
				case 0 :System.out.println("수정 종료"); break;
				
				}
			}while(menuNum != 0);
			
		}
		
		
		
	
	} 

}
