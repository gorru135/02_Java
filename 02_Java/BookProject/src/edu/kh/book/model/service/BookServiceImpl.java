package edu.kh.book.model.service;

import java.util.List;
import java.util.Map;

import edu.kh.book.model.dao.BookDAO;
import edu.kh.book.model.dao.BookDAOImpl;
import edu.kh.book.model.dto.Book;

public class BookServiceImpl implements BookService{

	
	private BookDAO dao = null;
	
	
	public BookServiceImpl() throws Exception{
		
		dao = new BookDAOImpl(); 
	}
	
	@Override
	public Map<String, Object> bookListFullView() throws Exception {
		
		List<Book> bookList = dao.bookListFullView();
		
		int completeCount = 0;
		
		
		return null;
	}
}
