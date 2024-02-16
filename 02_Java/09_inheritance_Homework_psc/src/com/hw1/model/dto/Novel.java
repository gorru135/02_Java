package com.hw1.model.dto;

public class Novel extends Book{

	private String genre;
	
	public Novel() {}

	public Novel(String title, String author, String genre) {
		super(title, author);
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public void displayInfo() {
		System.out.print("[소설] 제목 : " + this.getTitle()+ " / " );
		System.out.print("저자 : " + this.getAuthor()+ " / "  );
		System.out.println("장르 : "+ this.getGenre() );
	}

	
	
	
	
	
	
	
	
	
}
