package edu.kh.collection.book;

public class Book {

	private int booknumber; // 도서 번호
	private String title; // 도서 제목 
	private String author; // 저자 
	private int price; // 도서 가격 
	private String publisher; // 출판사 
	
	public Book() {}

	public Book(int booknumber, String title, String author, int price, String publisher) {
		super();
		this.booknumber = booknumber;
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}

	public int getBooknumber() {
		return booknumber;
	}

	public void setBooknumber(int booknumber) {
		this.booknumber = booknumber;
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
		return "Book [booknumber=" + booknumber + ", title=" + title + ", author=" + author + ", price=" + price
				+ ", publisher=" + publisher + "]";
	}
	
	
	
}