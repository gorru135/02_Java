package com.kh.inheritance.model.dto;

public class Phone {
	
	private String brand;
	private String model;
	private int year;
	private int price;
	
	//기본생성자 
	public Phone() {}

	//매개변수생성자 
	public Phone(String brand, String model, int year, int price) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.price = price;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int yeaar) {
		this.year = yeaar;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	public void printlnfo() {
		
		System.out.println("brand : " + this.getBrand() );
		System.out.println("Model : " + this.getModel() );
		System.out.println("year : " + this.getYear() );
		System.out.println("price : " + this.getPrice() +"원");
	}
	
	
}
	
