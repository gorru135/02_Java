package com.hw3.model.vo;

public class Product {

	private int pid;
	private String pName;
	private int price;
	private double tax;
	
	//기본 생성자
	public Product() {}
	//매개변수
	public Product(int pid, String pName, int price, double tax) {
		super();
		this.pid = pid;
		this.pName = pName;
		this.price = price;
		this.tax = tax;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}

	
	public String information() {
		return String.format("제품번호 : %d / 제품명 : %s / 제품가격 : %d / 제품세금 : %.1f",
							pid,pName,price,tax);
	}
	
}
