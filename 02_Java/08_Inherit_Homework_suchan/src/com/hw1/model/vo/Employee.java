package com.hw1.model.vo;

public class Employee extends Person{

	private int salary; //급여 
	private String drpt; //부서
	
	public Employee() {}

	public Employee(String name, int age, double height, double weight, int salary, String drpt) {
		super(name, age, height, weight);
		this.salary = salary;
		this.drpt = drpt;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDrpt() {
		return drpt;
	}

	public void setDrpt(String drpt) {
		this.drpt = drpt;
	}
	
	
	@Override
	public String information() {
	
		return super.information() + 
				String.format("급여 : %d / 부서 : %s ", salary, drpt);
	}
}
