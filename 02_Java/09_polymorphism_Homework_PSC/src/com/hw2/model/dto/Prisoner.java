package com.hw2.model.dto;

public class Prisoner extends Person{

	private String position;

	public Prisoner(String id, String name, String position) {
		super(id, name);
		this.position = position;
	}
	
	
	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	@Override
	public String getInfo() {
		return String.format("ID : %s , 이름 : %s , 죄목 : %s",id, name, position);
	}
}
	
	

