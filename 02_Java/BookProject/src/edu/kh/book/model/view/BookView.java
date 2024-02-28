package edu.kh.book.model.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

import edu.kh.book.model.dto.Book;
import edu.kh.book.model.service.BookService;
import edu.kh.book.model.service.BookServiceImpl;

public class BookView {

	
	private BufferedReader br = null;
	private BookService bookService = null;
	
	// 기본생성자 
	public BookView() {
		
		
		try {
			
			bookService = new BookServiceImpl(); // 다형성 중 업캐스팅 
			
			br = new BufferedReader(new InputStreamReader(System.in));
		} catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	/**
	 *  
	 */
	public void startView() {
		
		int input = 0;
		
		do {
			try {
				
				input = selectMenu();
				
				switch(input) {
				case 1 : bookListFullView(); break;
				case 2 : ; break;
				case 3 : ; break;
				case 4 : ; break;
				case 5 : ; break;
				case 6 : ; break;
				case 0 : System.out.println("프로그램 종료");;
				default : System.out.println("메뉴에 있는 번호만 선택해주세요"); break;
				
				
				}
				
			} catch(NumberFormatException e) {
				System.out.println("숫자만 입력해주세요.");
			
				
			} catch(IOException e ) {
				
				System.out.println("입/출력 관련 예외 발생");
			}
			
			
			catch(Exception e){
				e.printStackTrace();
				input = -1;
				
			} 
			
			
		} while(input != 0);
	}
	
	public int selectMenu() throws Exception{
		System.out.println("\n========== 수찬 서점 ==========\n");
		
		
		System.out.println("1. 전체 도서 조회");
		System.out.println("2. 도서 줄거리 내용");
		System.out.println("3. 도서 추가하기");
		System.out.println("4. 도서 수량조회");
		System.out.println("5. 도서 수정하기");
		System.out.println("6. 도서 삭제하기");
		System.out.println("0. 서점 나가기");
		
		System.out.print("메뉴 선택 : ");
		
		int input = Integer.parseInt(br.readLine());
		return input;
	}
	
	public void  bookListFullView() throws Exception{
		System.out.println("\n==========[1. 전체 도서 조회]==========\n");
		
		Map<String, Object> map = bookService.bookListFullView();
		List<Book> bookList = (List<Book>)map.get(map);
		
		System.out.printf("[ 팔린 도서 수 / 전체 도서 수량 : %d / %d ]\n"
				, bookList, bookList.size());
		System.out.println("--------------------------------------------------------------------");
		System.out.printf("%-3s %10s   %10s     %s\n", "인덱스", "등록일", "완료여부", "할 일 제목");
		System.out.println("--------------------------------------------------------------------");
		
		
	}
}
