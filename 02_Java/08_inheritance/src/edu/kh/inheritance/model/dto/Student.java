package edu.kh.inheritance.model.dto;

public class Student extends Person{
	//student 클래스에 person 클래스 내용을 연장한다.
	//== student 클래스에 person 클래스 내용(필드,메서드)을 추가하여 확장한다.
	
	// **상속**
	// 자식 extends 부모
	
	// 필드 
	// 부모가 가지고 있어서 주석 처리 
	/*private String name;
	private int age;
	private String nationality;*/
	private int grade; // 학년
	private int classRoom; // 반
	
	public Student() {}

	public Student(String name, int age, String nationality, int grade, int classRoom) {
		super(name, age, nationality); // super(); 부모의 기본 생성자
		//this.name = name;
		//this.age = age;
		//this.nationality = nationality;
		//setName(name);
		//setAge(age);
		//setNationality(nationality);
		
		this.grade = grade;
		this.classRoom = classRoom;
	}
/*
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}*/

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " / " + grade + " / " + classRoom;
	}
	
}
