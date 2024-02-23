package edu.kh.todolist.model.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.lang.model.element.NestingKind;

// DTO : (Data Transfer Object) : (관련된 값의 묶음) 값 전달 역활 
// == VO (Value Object) 

//스트림 입출력을 위한 직렬화
public class Todo implements Serializable{
 
	private String title;
	private String detal;
	private boolean complete;
	private LocalDateTime regDate;
	
	//Java 입출력 패키지
	
	// 기본생성자 
	public Todo() {}
	
	// 매개변수생성자 
	public Todo(String title, String detal, boolean complete, LocalDateTime regDate) {
		super();
		this.title = title;
		this.detal = detal;
		this.complete = complete;
		this.regDate = regDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetal() {
		return detal;
	}

	public void setDetal(String detal) {
		this.detal = detal;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	public LocalDateTime getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDateTime regDate) {
		this.regDate = regDate;
	}

	
	
	
}
