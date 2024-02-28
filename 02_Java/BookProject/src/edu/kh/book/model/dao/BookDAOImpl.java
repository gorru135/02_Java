package edu.kh.book.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import edu.kh.book.model.dto.Book;

public class BookDAOImpl implements BookDAO{

	private final String FILE_PATH ="/io_Book/bookset.dat"; 
	
	private ObjectInputStream ois = null;
	private ObjectOutputStream oos = null;
	
	
	private Set<Book> bookSet = null;
	
	
	public BookDAOImpl() throws Exception{
		
		File file = new File(FILE_PATH);
		
		if(file.exists()) {
			
			try {
				
				ois = new ObjectInputStream(new FileInputStream(FILE_PATH));
				bookSet = (HashSet<Book>)ois.readObject();
				
				
			} finally {
				
				if(ois != null)ois.close();
			}
			
			
		} else {
			
			// 파일이 없다면 자동 생성 해주기
			File directory = new File("/io_Book");
			if(directory.exists() )directory.mkdir();
			
			bookSet = new HashSet<Book>();
			
			bookSet.add(new Book(1111,"해리포터","J.K 롤링",15900,"문학수첩"));
			bookSet.add(new Book(2222,"반지의제왕","J.R.R 톨킨",16800,"아르테"));
			bookSet.add(new Book(3333,"양들의침묵","토머스 해리스",15220,"나무의 철학"));
		
			try {
				
				oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
				oos.writeObject(bookSet);
				
				
				
				
			} finally {
				
				if(oos != null)oos.close();
			}
		
			System.out.println("bookfile 생성 완료");
		}
	}
	@Override
	public List<Book> bookListFullView() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
