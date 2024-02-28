package edu.kh.book.model.dto;

import java.io.Serializable;

public class Book implements Serializable{

	private int bookNum;//도서 번호
	private String title;// 도서 제목 
	private String author; // 도서 저자
	private int price; //책 가격
	private String publisher; //출판사 
	
	public Book() {}

	public Book(int bookNum, String title, String author, int price, String publisher) {
		super();
		this.bookNum = bookNum;
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [bookNum=" + bookNum + ", title=" + title + ", author=" + author + ", price=" + price
				+ ", publisher=" + publisher + "]";
	}
	
	

}
