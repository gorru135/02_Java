package edu.kh.book.model.dao;

import java.util.List;

import edu.kh.book.model.dto.Book;

public interface BookDAO {

	List<Book> bookListFullView()throws Exception;

}
