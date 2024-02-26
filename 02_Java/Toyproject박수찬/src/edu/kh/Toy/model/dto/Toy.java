package edu.kh.Toy.model.dto;

import java.io.Serializable;
import java.time.LocalDateTime;


public class Toy implements Serializable {
	
	private String name; // 장난감이름
	private String detal; //특이사항
	private boolean complete; // 완료여부
	private LocalDateTime regDate; //생산일
	private int quantity;// 수량 
	
	// 기본 생성자 
	public Toy() {}
	
	// 매개변수생성자
	public Toy(String name, String detal, boolean complete, LocalDateTime regDate, int quantity) {
		super();
		this.name = name;
		this.detal = detal;
		this.complete = complete;
		this.regDate = regDate;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Toy [name=" + name + ", detal=" + detal + ", complete=" + complete + ", regDate=" + regDate
				+ ", quantity=" + quantity + "]";
	}


	
}
